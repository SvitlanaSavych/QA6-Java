package lesson2.homework;

public class Homework {
    //    4)
//    Coздать две переменные типа int:
//    int a = 7;
//    int b = 9;
//    Поменять между собой значения переменных a и b.
//    Создавать новые переменные нельзя.
//    Можно применять только арифметические действия к перемнным a и b.
//    Вывести в консоль значения переменных a и b после их переопределения.
    public static void main(String[] args) {
        int a;
        int b;
        a = 7;
        b = 9;
        b = b - a;
        a = b + a;
        b = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}

