package lesson4.homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        3)
//        При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
//        и всегда отнимать от большего меньшее. Вывести эту разность в консоль.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Insert number 2:");
        int number2 = scanner.nextInt();
        int number3 = number1 - number2;
        String result = number1 > number2 ? String.valueOf("Number difference = " + number3) : "Error";
        System.out.println(result);
    }
}
