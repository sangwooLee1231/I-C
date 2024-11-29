package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AwsDistributedDatabaseExample {
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    private static final String MONGO_URI = "mongodb://localhost:27017";

    public static void main(String[] args) {
        try{
            Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
            mongoLogger.setLevel(Level.SEVERE);

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mysqlConnection = DriverManager.getConnection(MYSQL_URL,MYSQL_USER,MYSQL_PASSWORD);
            System.out.println("Connected to MySQL.");

            String insertUserSQL = "INSERT INTO users (name, email) VALUES(?,?)";
            PreparedStatement pstmt = mysqlConnection.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1,"hong");
            pstmt.setString(2,"hong@new.com");
            pstmt.executeUpdate();
            System.out.println("SQL 전송 완");

            ResultSet rs = pstmt.getGeneratedKeys();
            int userId = 0;
            if(rs.next()) {
                userId = rs.getInt(1);
            }
            System.out.println("자동생성된 userID > " + userId);

            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase mongodatabase = mongoClient.getDatabase("aws");
            MongoCollection<Document> logCollection = mongodatabase.getCollection("activity_logs");
            System.out.println("Connected to MongoDB.");
            System.out.println("몽고DB 연결");

            Document activityLog = new Document();
            activityLog.append("userId", userId);
            activityLog.append("activity","login");
            activityLog.append("timestamp", "2024-11-10T10:15:00");

            Document activityLog2 = new Document();
            activityLog2.append("userId", userId);
            activityLog2.append("activity","Order");
            activityLog2.append("timestamp", "2024-11-11T11:15:00");

            Document activityLog3 = new Document();
            activityLog3.append("userId", userId);
            activityLog3.append("activity","Order");
            activityLog3.append("timestamp", "2024-11-21T11:15:00");

            logCollection.insertOne(activityLog);
            logCollection.insertOne(activityLog2);
            logCollection.insertOne(activityLog3);

            System.out.println(userId);
            String selectUserSQL = "SELECT * FROM users WHERE id = ?";
            PreparedStatement selectPstmt = mysqlConnection.prepareStatement(selectUserSQL);
            selectPstmt.setInt(1,userId);
            ResultSet userResult = selectPstmt.executeQuery();
            if(userResult.next()) {
                System.out.println("User Info: ");
                System.out.println("ID: " + userResult.getString("id"));
                System.out.println("Name: " + userResult.getString("name"));
                System.out.println("Email: " + userResult.getString("email"));

            }

            Document filter = new Document("userId", userId);
            ArrayList<Document> result = logCollection.find(filter).into(new ArrayList<Document>());
            System.out.println(result);

            mysqlConnection.close();
            mongoClient.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
