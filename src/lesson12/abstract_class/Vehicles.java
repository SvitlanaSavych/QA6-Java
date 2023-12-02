package lesson12.abstract_class;

public abstract class Vehicles {
    private String name;
    private int cost;

    public Vehicles(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    abstract void move();

    public static void main(String[] args) {

    }
}

