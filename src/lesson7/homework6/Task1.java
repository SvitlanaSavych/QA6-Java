package lesson7.homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//     1) Пользователь задает размерность двумерного массива с клавиатуры.
//        Массив заполняется случайными числами от 0 до 1000.
//        Необходимо создать одномерный массив, состоящий из максимальных значений
//        каждого отдельного массива входящего в двумерный.
//        Новый полученный массив вывести на экран.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two digits the size of array using Enter:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Size of array:" + "[" + x + "]" + "[" + y + "]");

        int[][] randomArray = new int[x][y];
        int[] result = new int[x];

        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++)
                randomArray[i][j] = random.nextInt(1000);
        }

        for (int i = 0; i < randomArray.length; i++) {
            int max = randomArray[i][0];

            for (int j = 1; j < randomArray[i].length; j++)
                if (max < randomArray[i][j])
                    max = randomArray[i][j];

            result[i] = max;
        }
        System.out.println(Arrays.deepToString(randomArray));
        System.out.println("New array");
        System.out.print(Arrays.toString(result));
    }
}
