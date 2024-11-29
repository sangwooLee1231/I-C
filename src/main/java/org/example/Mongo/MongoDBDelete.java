package org.example.Mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDBDelete {

    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);
        MongoClient client = new MongoClient( "localhost", 27017 );
        MongoDatabase db = client.getDatabase( "naver" );
        MongoCollection<Document> member = db.getCollection("members");
        Document doc = new Document();
        doc.append( "name", "이순신" );

        member.deleteOne(doc);
        client.close();



    }
}
