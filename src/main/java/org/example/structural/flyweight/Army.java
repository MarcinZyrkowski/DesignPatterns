package org.example.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private final List<Fighter> army = new ArrayList<>();

    public void spawnFighter(FighterRank rank) {
        Fighter f = FighterFactory.getFighter(rank);
        army.add(f);
    }

    public void drawArmy() {
        for (Fighter fighter : army) {
            switch (fighter.getRank()) {
                case PRIVATE:
                    System.out.print("P ");
                    break;
                case SERGEANT:
                    System.out.print("S ");
                default:
                    System.out.print("M ");
                    break;
            }
        }
    }

}
