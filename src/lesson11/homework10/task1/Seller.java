package lesson11.homework10.task1;

public class Seller {
    private String nameOfSeller;
    private boolean honest;

    public Seller(String nameOfSeller, boolean honest) {
        this.nameOfSeller = nameOfSeller;
        this.honest = honest;
    }

    public String getNameOfSeller() {
        return nameOfSeller;
    }

    public boolean isHonest() {
        return honest;
    }
}
