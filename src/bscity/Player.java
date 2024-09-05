package bscity;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int money;
    private List<Building> buildings;

    public Player() {
        this.money = 1000;
        this.buildings = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void buyBuilding(Building building) {
        if(money >= building.getCost()) {
            buildings.add(building);
            money -= building.getCost();
        }
    }

    public void collectIncome() {
        for(Building building : buildings) {
            money += building.getIncome();
        }
    }
}
