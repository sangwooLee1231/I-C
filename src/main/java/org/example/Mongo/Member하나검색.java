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

public class Member하나검색 {
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
        Document filter = new Document();
        filter.append("id","hong");



        //4. 전송, 결과처리
        FindIterable<Document> result = member.find(filter);
        Document doc = result.first();
        System.out.println(doc.getString("id"));
        System.out.println(doc.getString("pw"));
        System.out.println(doc.getString("name"));
        System.out.println(doc.getString("tel"));


        System.out.println("===========================");
        List<Document> result2 = member.find(filter).into(new ArrayList<>());
        System.out.println(result2.get(0).getString("id"));
        System.out.println(result2.get(0).getString("pw"));
        System.out.println(result2.get(0).getString("name"));
        System.out.println(result2.get(0).getString("tel"));


        client.close();
    }
}
