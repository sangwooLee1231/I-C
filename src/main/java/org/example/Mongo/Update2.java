package org.example.Mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update2 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        MongoClient client = new MongoClient("localhost", 27017);
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");

        Document filter = new Document();
        filter.append("id","hong");

        Bson pw = Updates.set("pw","7777");
        Bson name = Updates.set("name","winner");

        List<Bson> list = new ArrayList<>();
        list.add(pw);
        list.add(name);
        Bson all = Updates.combine(list);

        member.updateOne(filter, all);
        client.close();
    }
}
