package lesson5.homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//          2)
//        Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет,
//        является оно палиндромом или нет. И выводит данную информацию на экран.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        int num = number, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (number == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No palindrome");
        }
    }
}
