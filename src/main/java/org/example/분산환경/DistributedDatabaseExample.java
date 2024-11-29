package org.example.분산환경;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DistributedDatabaseExample {

    // MySQL JDBC URL
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/naver";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    // MongoDB Connection URI
    private static final String MONGO_URI = "mongodb://localhost:27017";

    public static void main(String[] args) {
        try{

            Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
            mongoLogger.setLevel(Level.SEVERE);
                //1. mysql 연결
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mysqlConnection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("1. Connected to MySQL");
            //2. 회원가입 후 자동증가(auto-increment)한 id를 얻어오자.
            String insertUserSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = mysqlConnection.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "john.doe@example.com");
            pstmt.executeUpdate();
            System.out.println("2. SQL 전송");

            ResultSet rs = pstmt.getGeneratedKeys();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt(1);
            }
            System.out.println("Inserted user with ID: " + userId);


            //3. 2번에서 얻은 id를 이용해서 몽고db에 주문정보를 넣자.
            //      3-1 mongodb에 연결
            //      3-2 document를 만들어서 전송

            MongoClient mongoClient = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("naver2");
            MongoCollection<Document> ordersCollection = mongoDatabase.getCollection("orders");
            System.out.println("3. Connected to MongoDB.");

            Document order = new Document("user_id", userId)
                    .append("order_date", "2024-11-20")
                    .append("items", Arrays.asList(
                            new Document("product", "item1").append("quantity", 2),
                            new Document("product", "item2").append("quantity", 1)
                    ));
            ordersCollection.insertOne(order);
            System.out.println("Inserted order for user ID: " + userId);
            System.out.println("4. 몽고db에 저장");
                //4. 회원정보는 mysql검색, 회원주문정보보기는 mongoDB에서 검색해서 분산
                // 4-1 회원정보 mysql 검색
            String selectUserSQL = "SELECT * FROM users WHERE id = ?";
            PreparedStatement selectPstmt = mysqlConnection.prepareStatement(selectUserSQL);
            selectPstmt.setInt(1, userId);
            ResultSet userResult = selectPstmt.executeQuery();
            if (userResult.next()) {
                System.out.println("User Info: ");
                System.out.println("ID: " + userResult.getInt("id"));
                System.out.println("Name: " + userResult.getString("name"));
                System.out.println("Email: " + userResult.getString("email"));
            }
            // 4-2 회원주문정보보기는 mongodb 검색
            // 필터 JSON(Document)

            Document userOrder = ordersCollection.find(Filters.eq("user_id", userId)).first();
            if (userOrder != null) {
                System.out.println("Order Info: ");
                System.out.println(userOrder.toJson());
            }

            // Close connections
            mysqlConnection.close();
            mongoClient.close();


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

