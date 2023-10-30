package lesson5.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        5)
//        Есть одномерный массив из 10 элементов, заполненный случайными числами.
//        Пользователь вводит с клавиатуры число. Программа показывает есть ли такое число в созданном
//        до этого массиве.

        Random randomNumbers = new Random();
        int[] newRandom = new int[10];
        for (int i = 0; i < newRandom.length; i++) {
            newRandom[i] = randomNumbers.nextInt(100);
        }
//        System.out.println(Arrays.toString(newRandom));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();

        boolean foundNumber  = false;
        for (int i = 0; i < newRandom.length; i++) {
            if (newRandom[i] == number) {
                foundNumber = true;
                break;
            }
        }
            if (foundNumber){
                System.out.println("Это число есть в рандомном массиве: " + number);
            }else {
                System.out.println("Такого числа нет в рандомном массиве: " + number);
            }

            }
        }







