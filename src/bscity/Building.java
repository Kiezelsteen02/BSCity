package bscity;

public class Building {
    private String name;
    private int cost;
    private int income;

    public Building(String name, int cost, int income) {
        this.name = name;
        this.cost = cost;
        this.income = income;
    }

    public int getCost() {
        return cost;
    }

    public int getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }
}
