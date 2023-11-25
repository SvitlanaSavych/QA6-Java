package lesson11.homework10.task1;

public class Shop implements ReturnCost{
    private String nameOfShop;

    public Shop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }
    public String getNameOfShop() {
        return nameOfShop;
    }

    @Override
    public void returnCost(Buyer buyer, Seller seller, Good good) {
        int discount = buyer.isDiscountCard() ? 10 : 0;
        if (seller.isHonest() && good.isAlcohol() && buyer.getAgeOfBuyer() < 18) {
            System.out.println("Вы несовершеннолетний! Мы не можем вам продать алкоголь!!!");
        } else if (seller.isHonest() && good.isAlcohol() && buyer.getAgeOfBuyer() > 18) {
            System.out.println("Вы уже взрослый и можете купить алкоголь.");
        } else if (discount > 0) {
            System.out.println("У вас есть скидка на товар " + discount + "%");
        }else{
            System.out.println("Вы можете купить любой товар.");

        }

    }

    public static void main(String[] args) {
        Shop shop = new Shop("MarketMall");
        Buyer buyer = new Buyer("Max", 15, true);
        Seller seller = new Seller("Semen", true);
        Good good = new Good("alcohol", 200, true);
        shop.returnCost(buyer, seller, good);


        if (good.isAlcohol() && buyer.getAgeOfBuyer() < 18 && seller.isHonest()){
            System.out.println("Уважаемый " + buyer.getNameOfBuyer() + ", продавец " + seller.getNameOfSeller() + " нашего магазина "
                    + "'" + shop.getNameOfShop() + "'" + ", не может продать вам алкоголь, потому что ваш возраст " + buyer.getAgeOfBuyer() + ". Стоимость вашей покупки равна " +
                    good.getCostOfGoods() + ". Ваша скидка " + buyer.isDiscountCard() + ".");
        }else if (good.isAlcohol() == false) {
            System.out.println("Уважаемый " + buyer.getNameOfBuyer() + ", продавец " + seller.getNameOfSeller() + " нашего магазина "
                    + "'" + shop.getNameOfShop() + "'" + ", продаст вам этот товар " + good.getProductName() +
                    ", так как в ваших покупках нет алкогольной продукции, и ваш возраст " + buyer.getAgeOfBuyer() + ". Стоимость вашей покупки равна " +
                    good.getCostOfGoods() + ". Ваша скидка " + buyer.isDiscountCard() + ".");
        }else {
        System.out.println("Уважаемый " + buyer.getNameOfBuyer() + ", продавец " + seller.getNameOfSeller() + " нашего магазина "
                + "'" + shop.getNameOfShop() + "'" + ", продаст вам товар " + good.getProductName() +
                ", даже если в ваших покупках есть алкогольная продукция, и ваш возраст " + buyer.getAgeOfBuyer() + ". Стоимость вашей покупки равна " +
                good.getCostOfGoods() + ". Ваша скидка " + buyer.isDiscountCard() + ".");

        }
    }
}



