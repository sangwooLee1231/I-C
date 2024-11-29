package org.example.Mongo;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.FindIterable;


public class 연결테스트 {
    public static void main(String[] args) {
        /*
         * Requires the MongoDB Java Driver.
         * https://mongodb.github.io/mongo-java-driver
         */

        Bson filter = new Document("tel", "665-786-0090");

        MongoClient mongoClient = new MongoClient(
                new MongoClientURI(
                        "mongodb://localhost:27017/"
                )
        );
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("member");
        FindIterable<Document> result = collection.find(filter);
        System.out.println(result.first().getString("id"));
        System.out.println(result.first().getString("pw"));
        System.out.println(result.first().getString("name"));
        System.out.println(result.first().getString("tel"));
    }
}
