package lesson4.homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        2)
//        Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли
//        из этих сторон построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer 1:");
        int a = scanner.nextInt();
        System.out.println("Please enter integer 2:");
        int b = scanner.nextInt();
        System.out.println("Please enter integer 3:");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник построить можно.");
        } else {
            System.out.println("Треугольник построить нельзя.");
        }

    }
}
