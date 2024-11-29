package org.example.Mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member여러개검색 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);
        //1. MongoClient 객체 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. DB연결 collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member 컬렉션까지 연결 성공");
        //3. 전송할 js 생성(조건)


        //4. 전송, 결과처리

        // FIndIterable을 사용해서 select문 사용
        FindIterable<Document> result = member.find();
        for(Document doc : result) {
            System.out.println(doc.getString("id"));
            System.out.println(doc.getString("pw"));
            System.out.println(doc.getString("name"));
            System.out.println(doc.getString("tel"));
        }

        System.out.println("===========================");
        // List를 사용해서 select문 사용
        List<Document> result2 = member.find().into(new ArrayList<>());
        for(Document doc : result2) {
            System.out.println(doc.getString("id"));
            System.out.println(doc.getString("pw"));
            System.out.println(doc.getString("name"));
            System.out.println(doc.getString("tel"));
        }

        client.close();
    }
}
