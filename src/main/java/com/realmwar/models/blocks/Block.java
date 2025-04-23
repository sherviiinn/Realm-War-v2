package main.java.com.realmwar.models.blocks;

import com.realmwar.models.Position;

public abstract class Block {
    private Position position;
    private boolean isAbsorbed;
    private int kingdomId; // -1 if not absorbed

    public Block(Position position) {
        this.position = position;
        this.isAbsorbed = false;
        this.kingdomId = -1;
    }

    public abstract boolean canBuildStructure();
    public abstract int getResourceYield(String resourceType);
    
    // Getters and setters
    public Position getPosition() { return position; }
    public boolean isAbsorbed() { return isAbsorbed; }
    public int getKingdomId() { return kingdomId; }
    public void setAbsorbed(boolean absorbed, int kingdomId) {
        this.isAbsorbed = absorbed;
        this.kingdomId = kingdomId;
    }
}