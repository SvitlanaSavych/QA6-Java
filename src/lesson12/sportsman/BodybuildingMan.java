package lesson12.sportsman;

public class BodybuildingMan implements Sportable {
    public String name;

    public BodybuildingMan(String name) {
        this.name = name;
    }
    public void doSmth(){
        System.out.println("Just do it!");
    }


    public void doSport() {
        System.out.println("Я люблю качалку. Мое имя "+name+".");
    }
}
