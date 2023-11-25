package lesson11.homework10.task1;

public class Buyer {
    private String nameOfBuyer;
    private int ageOfBuyer;
    private boolean discountCard;


    public Buyer(String nameOfBuyer, int ageOfBuyer, boolean discountCard) {
        this.nameOfBuyer = nameOfBuyer;
        this.ageOfBuyer = ageOfBuyer;
        this.discountCard = discountCard;
    }

    public String getNameOfBuyer() {
        return nameOfBuyer;
    }

    public void setNameOfBuyer(String nameOfBuyer) {
        this.nameOfBuyer = nameOfBuyer;
    }

    public int getAgeOfBuyer() {
        return ageOfBuyer;
    }

    public boolean isDiscountCard() {
        return discountCard;
    }
}
