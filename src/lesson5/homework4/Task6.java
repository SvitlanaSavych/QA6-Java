package lesson5.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        6)
//        Заполнить массив на 45 элементов случайными числами от -50 до +50.
//        Найти минимальный элемент и вывести его на консоль.
//        Найти максимальный элемент и вывести его на консоль.

        Random randomNumbers = new Random();
        int[] arrayNum = new int[45];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = (int) ((Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(arrayNum));

        int min = arrayNum[0];
        for (int i = 0; i < arrayNum.length; i++) {
            if (min > arrayNum[i]) {
                min = arrayNum[i];
            }
        }
            System.out.println("Min is: " + min);

        int max = arrayNum[0];
        for (int i = 0; i < arrayNum.length; i++) {
            if (max < arrayNum[i]) {
                max = arrayNum[i];
            }
        }
            System.out.println("Max is: " + max);
        }
    }
