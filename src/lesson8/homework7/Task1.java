package lesson8.homework7;

import java.util.Arrays;

public class Task1 {
//       1)
//    Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все
//    четные числа списком, a также нечетные числа списком.

    public void arrayOfIntegersNumbers(int[] arrayOfIntegers) {
//        четные числа:
        String evenNumbers = "";
//        нечетные числа:
        String oddNumbers = "";
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] % 2 == 0) {
                evenNumbers = evenNumbers + arrayOfIntegers[i] + " ";
            } else {
                oddNumbers = oddNumbers + arrayOfIntegers[i] + " ";
            }
        }
        System.out.println("Even numbers of array: " + evenNumbers);
        System.out.println("Odd numbers of array: " + oddNumbers);
    }

    public static void main(String[] args) {
        int[] arrayOfIntegers = {22, 99, 88, 24, 91, 33, 79, 15, 103, 204, 119,9,394,426,48,52};
        new Task1().arrayOfIntegersNumbers(arrayOfIntegers);
    }
}


