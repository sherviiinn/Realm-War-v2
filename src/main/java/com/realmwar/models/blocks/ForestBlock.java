package main.java.com.realmwar.models.blocks;

import com.realmwar.models.Position;

public class ForestBlock extends Block {
    public ForestBlock(Position position) {
        super(position);
    }

    @Override
    public boolean canBuildStructure() {
        return isAbsorbed();
    }

    @Override
    public int getResourceYield(String resourceType) {
        if (!isAbsorbed()) return 0;
        
        return switch (resourceType) {
            case "GOLD" -> 0;
            case "FOOD" -> 2; // Forest provides more food
            default -> 0;
        };
    }
    
    public double getAttackBonus() {
        return 1.2; // 20% attack bonus
    }
}