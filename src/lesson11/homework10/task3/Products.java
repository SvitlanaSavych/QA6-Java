package lesson11.homework10.task3;

public enum Products {
    APPLE(20), POTATO(13), MILK(47), BEER(90), TOBAKKO(300);
    private int cost;


    Products(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}

