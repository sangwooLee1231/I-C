package org.example.DBCP;

public class DBCP {
    static DBCP instance;

    private DBCP() {
    }

    public static DBCP getInstance() {
    if(instance == null) {
        instance = new DBCP();
        }
    return instance;
    }
}
