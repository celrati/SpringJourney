package com.springmvc.oneoneuni;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "achraf";
        String pass = "password";

        try {
            System.out.println("Connecting to database : "+ jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("connection succesful");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
