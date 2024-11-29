package org.example.Mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Member하나삭제 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);
        //1. MongoClient 객체 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. DB연결 collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member 컬렉션까지 연결 성공");
        //3. 전송할 js 생성
        //insert할 json(document)을 생성
        Document doc = new Document();
        doc.append("id","apple"); // {id: "apple"}

        //4. 전송, 결과처리
        member.deleteOne(doc);
        client.close();



    }
}
