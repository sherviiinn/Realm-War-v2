package main.java.com.realmwar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = "jdbc:sqlite:resources/db/realmwar.db";
    private static Connection connection;
    
    private DBConnection() {}
    
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                connection = DriverManager.getConnection(DB_URL);
                // Enable foreign key constraints
                connection.createStatement().execute("PRAGMA foreign_keys = ON");
            } catch (SQLException e) {
                System.err.println("Error connecting to database: " + e.getMessage());
                throw e;
            }
        }
        return connection;
    }
    
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}