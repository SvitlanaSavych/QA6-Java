package lesson6.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//    Написати програму “числа”, яка загадує випадкове число та пропонує гравцеві його вгадати.
//                      Технічні вимоги:
// • За допомогою java.util.Random програма загадує випадкове число в діапазоні [0-100] та пропонує
//   гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
// • Перед початком на екран виводиться текст: Let the game begin!
// • Сам процес гри обробляється у нескінченному циклі.
// • Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим,
//   що ввів користувач.
// • Якщо введене число менше загаданого, програма виводить на екран текст: Your number is too small. Please, try again..
//   Якщо введене число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again..
// • Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
// • Завдання повинно бути виконане за допомогою масива (НЕ використовуйте інтерфейси List, Set, Map).

        Random random = new Random();
        int[] newRandom = new int[10];
        for (int i = 0; i < newRandom.length; i++) {
            newRandom[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(newRandom));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        int name;
        for (int i = 0; i < newRandom.length; i++) {
        }
    }
}