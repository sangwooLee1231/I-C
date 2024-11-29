package org.example.Mongo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NaverInsertMain {

    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);

        MongoDBBlogInsert.insertBlogMember();
        MongoDBCafeInsert.insertCafeMember();
        MongoDBLineInsert.insertLineMember();
    }
}
