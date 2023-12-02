package lesson12.sportsman;

public class CalisthenicsMan implements Sportable {

    public String name;

    public CalisthenicsMan(String name) {
        this.name = name;
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю турник. Мое имя "+name+".");
    }
}
