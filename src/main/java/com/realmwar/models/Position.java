package com.realmwar.models;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public boolean equals(Position other) {
        return this.x == other.x && this.y == other.y;
    }
    @Override
    public String toString() {
        return "Position: (" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
