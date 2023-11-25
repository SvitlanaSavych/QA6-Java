package lesson11.homework10.task1;

public class Good {
    private String productName;
    private int costOfGoods;
    private boolean alcohol;

    public Good(String productName, int costOfGoods, boolean alcohol) {
        this.productName = productName;
        this.costOfGoods = costOfGoods;
        this.alcohol = alcohol;
    }

    public String getProductName() {
        return productName;
    }

    public int getCostOfGoods() {
        return costOfGoods;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }
}
