package lesson9;

import java.util.Scanner;

public class Lesson9Task1 {
//    1)Написать метод, который будет спрашивать у пользователя ввести с клавиатуры предложение
//    а после выводит в консоль из скольки слов состоит данное предложение.
//    А также этот метод должен возвращать количество этих слов.

    public int string() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String string = scanner.nextLine();
        String[] string2 = string.split(" ");
        int i = string2.length;
        System.out.println("Count of words " + i);
        return i;
    }

    public static void main(String[] args) {
        new Lesson9Task1().string();

//                или так:
//        int number = new Lesson9Task1().string();
//        System.out.println("Count of words " + number);
    }
}
