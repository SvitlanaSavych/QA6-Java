package lesson12.sportsman;

public class CrossFitMan implements Sportable {
    public String name;

    public CrossFitMan(String name) {
        this.name = name;
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю кроссфит. Мое имя "+name+".");
    }
}
