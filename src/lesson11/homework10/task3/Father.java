package lesson11.homework10.task3;


public class Father {
    private String name;
    private int moneyInPocket;

    public Father(String name, int moneyInPocket) {
        this.name = name;
        this.moneyInPocket = moneyInPocket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyInPocket() {
        return moneyInPocket;
    }

    public void setMoneyInPocket(int moneyInPocket) {
        this.moneyInPocket = moneyInPocket;
    }


    private static int calculateTotalCost(int countOfProduct1, int countOfProduct2) {
        return Products.MILK.getCost() * countOfProduct1 + Products.POTATO.getCost() * countOfProduct2;
    }

    public void buyProducts(Products product1, Products product2) {
        try {
            int countOfProduct1 = 3;
            int countOfProduct2 = 6;
            int totalCost = calculateTotalCost(countOfProduct1, countOfProduct2);

            if (totalCost > moneyInPocket) {
                throw new NotEnoughMoneyException("У вас недостаточно денег на покупку...");
            }
            if (product1 == Products.BEER || product1 == Products.TOBAKKO || product2 == Products.BEER || product2 == Products.TOBAKKO) {
                throw new BeerOrTobaccoException("Покупка содержит запрещенный товар!");
            }
            if (countOfProduct1 % 3 != 0 || countOfProduct2 % 3 != 0) {
                throw new DivisionByThreeOfGoodsException("Количество товара не делится на три!");
            }
            System.out.println("Уважаемый " + name + " стоимость ваших покупок "
                    + totalCost + ". Вы приобрели " + product1 + " в количестве " + countOfProduct1 + " и " + product2 + " в количестве " + countOfProduct2 + ".");
        }catch (NotEnoughMoneyException | BeerOrTobaccoException | DivisionByThreeOfGoodsException exception){
            System.out.println("Неприятная ситуация: " + exception.getMessage());
        }

    }
    public void buyProducts(Products product1) {
        try {
            int countOfProduct1 = 2;
            int totalCost = Products.APPLE.getCost() * countOfProduct1;

            if (totalCost > moneyInPocket) {
                throw new NotEnoughMoneyException("У вас недостаточно денег на покупку...");
            }
            if (product1 == Products.BEER || product1 == Products.TOBAKKO) {
                throw new BeerOrTobaccoException("Покупка содержит запрещенный товар!");
            }
            if (countOfProduct1 % 3 != 0) {
                throw new DivisionByThreeOfGoodsException("Количество товара не делится на три!");
            }
            System.out.println("Уважаемый " + name + " стоимость ваших покупок "
                    + totalCost + ". Вы приобрели " + product1 + " в количестве " + countOfProduct1 + ".");
        }catch (NotEnoughMoneyException | BeerOrTobaccoException | DivisionByThreeOfGoodsException exception){
            System.out.println("Неприятная ситуация: " + exception.getMessage());
        }

    }
    public static void main(String[] args) {
        Father father = new Father("Mihail", 300);
        father.buyProducts(Products.APPLE, Products.POTATO);
        father.buyProducts(Products.POTATO);
    }
}