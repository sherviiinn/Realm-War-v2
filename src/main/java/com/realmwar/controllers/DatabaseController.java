package com.realmwar.controllers;

import com.realmwar.database.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseController {
    private Connection connection;

    public DatabaseController() {
        try {
            this.connection = DBConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(Object obj) {
        // Implement create logic
    }

    public Object read(int id) {
        // Implement read logic
        return null;
    }

    public void update(Object obj) {
        // Implement update logic
    }

    public void delete(int id) {
        // Implement delete logic
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
