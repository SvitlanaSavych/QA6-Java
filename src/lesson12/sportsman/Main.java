package lesson12.sportsman;

public class Main {
    /*Создать интерфейс Sportable в котором назначить только один метод doSport().
    Создать класс CrossFitMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю кроссфит. Мое имя {name}.".
    Создать класс BodybuildingMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю качалку. Мое имя {name}." .
    Создать класс CalisthenicsMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю турник. Мое имя {name}.".
    Создать массив типа Sportable. Разместить в него спорстменов разного вида. Пройтись циклом по всему массиву и
    вызвать у каждого спортсмена метод doSport().

    P.s. В классах поля сделать приватными. Не забыть про конструкторы, геттеры и сеттеры. А также методы toString,
    hashCode() и equals().*/

    public static void main(String[] args) {
        Sportable sportsMan1 = new BodybuildingMan("Alex");
        Sportable sportsMan2 = new CalisthenicsMan("Max");
        Sportable sportsMan3 = new CrossFitMan("Ben");

        Sportable[] arrayOfSportMen = {sportsMan1, sportsMan2, sportsMan3};
        for (Sportable man : arrayOfSportMen) {
            man.doSport();
        }
    }
}

