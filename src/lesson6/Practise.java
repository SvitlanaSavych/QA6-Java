package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Practise {
    public static void main(String[] args) {
//        1)Заполнить массив на 10 элементов случайными числами
//        от -50 до +50.
//        Вывестив консоль сам массив.
//        Вывести в консоль сумму всех его элементов.

        int [] newArray = new int[10];
        Random random = new Random();
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(newArray));

        int sumResult = 0;
        for (int i = 0; i < newArray.length; i++){
            sumResult = sumResult + newArray[i];
        }
        System.out.println("Sum of all elements = " +
                "" + sumResult);
    }
}
