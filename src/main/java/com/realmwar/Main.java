package main.java.com.realmwar;

import com.realmwar.views.GameFrame;

public class Main {
    public static void main(String[] args) {
        // Initialize database tables
        try {
            new com.realmwar.database.PlayerDAO().createTable();
            new com.realmwar.database.GameStateDAO().createTable();
        } catch (Exception e) {
            System.err.println("Failed to initialize database: " + e.getMessage());
        }
        
        // Start the game
        SwingUtilities.invokeLater(() -> {
            GameFrame gameFrame = new GameFrame();
            gameFrame.setVisible(true);
        });
    }
}