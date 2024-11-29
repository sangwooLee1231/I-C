package org.example.Mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member하나검색응용 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient client = new MongoClient("localhost",27017);
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> memo = db.getCollection("memo");

        Document filter = new Document();
        filter.append("age",3);

        FindIterable<Document> result = memo.find(filter);
        Document doc = result.first();
        System.out.println(doc.getString("name"));
        System.out.println(doc.getString("age"));
        System.out.println(doc.getString("office"));
        System.out.println(doc.getString("phone"));

        client.close();
    }
}