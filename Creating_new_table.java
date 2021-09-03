package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/mansoor/IdeaProjects/SQLite_p/TestDB.db");
            Statement statement =conn.createStatement();
            statement.execute("CREATE TABLE Movies (name TEXT, actor TEXT, actress TEXT, director TEXT, year_of_release INTEGER)");

        }
        catch (SQLException e) {
            System.out.println("Something went wrong" +e.getMessage());

        }
    }
}
