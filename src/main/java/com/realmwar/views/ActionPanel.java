package main.java.com.realmwar.views;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JPanel {
    private JButton endTurnButton;
    private JButton buildButton;
    private JButton recruitButton;
    private JButton moveButton;
    private JButton attackButton;
    
    public ActionPanel() {
        setPreferredSize(new Dimension(800, 100));
        setLayout(new FlowLayout());
        
        endTurnButton = new JButton("End Turn");
        buildButton = new JButton("Build");
        recruitButton = new JButton("Recruit");
        moveButton = new JButton("Move");
        attackButton = new JButton("Attack");
        
        add(buildButton);
        add(recruitButton);
        add(moveButton);
        add(attackButton);
        add(endTurnButton);
        
        // Add action listeners
        endTurnButton.addActionListener(e -> {
            // Handle end turn
        });
        
        buildButton.addActionListener(e -> {
            // Open build menu
        });
    }
}