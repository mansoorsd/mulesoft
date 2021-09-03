package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/mansoor/IdeaProjects/SQLite_p/TestDB.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Movies" +
                    "(name TEXT, actor TEXT, actress TEXT, director TEXT, year_of_release INTEGER)");
            statement.execute("INSERT INTO Movies (name, actor, actress, director, year_of_release)" +
                    "VALUES ('Forrest Gump', 'Tom Hanks', 'Robin Wright', 'Robert Zemeckis', 1994)");
            statement.execute("INSERT INTO Movies (name, actor, actress, director, year_of_release)" +
                    "VALUES ('Inception', 'Leonardo DiCaprio', 'Marion Cotillard', 'Christopher Nolan', 2010)");
            statement.execute("INSERT INTO Movies (name, actor, actress, director, year_of_release)" +
                    "VALUES ('Gladiator', 'Russell Crowe', 'Connie Nielsen', 'Ridley Scott', 2000)");
            statement.execute("INSERT INTO Movies (name, actor, actress, director, year_of_release)" +
                    "VALUES ('The Matrix', 'Keanu Reeves', 'Carrie-Anne Moss', 'Lana Wachowski', 1999)");
            statement.execute("INSERT INTO Movies (name, actor, actress, director, year_of_release)" +
                    "VALUES ('Interstellar', 'Matthew McConaughey', 'Jessica Chastain', 'Christopher Nolan', 2014)");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());

        }
    }
}
