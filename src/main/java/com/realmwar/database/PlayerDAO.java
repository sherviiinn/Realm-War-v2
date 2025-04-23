package main.java.com.realmwar.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
    public void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS players (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "name TEXT NOT NULL," +
                     "wins INTEGER DEFAULT 0," +
                     "losses INTEGER DEFAULT 0," +
                     "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
        
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }
    
    public int addPlayer(String name) throws SQLException {
        String sql = "INSERT INTO players(name) VALUES(?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1;
    }
    
    // Other CRUD methods...
}