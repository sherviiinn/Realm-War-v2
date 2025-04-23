package main.java.com.realmwar.models.blocks;

import com.realmwar.models.Position;

public class EmptyBlock extends Block {
    public EmptyBlock(Position position) {
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
            case "GOLD" -> 1;
            case "FOOD" -> 0;
            default -> 0;
        };
    }
}