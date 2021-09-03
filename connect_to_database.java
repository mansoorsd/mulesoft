package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/mansoor/IdeaProjects/SQLite_p/TestDB.db");
            conn.close()
        }
        catch (SQLException e) {
            System.out.println("Something went wrong" +e.getMessage());

        }
    }
}

