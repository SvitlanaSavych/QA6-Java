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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Player, enter your name");
        String nameOfPlayer = scanner.nextLine();

        Random random = new Random();
        int number = random.nextInt(100);
//          System.out.println(number);
        while (true) {
            System.out.println("Enter the number from 0 till 100:");
            int enterNumber = scanner.nextInt();

            if (enterNumber < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (enterNumber > number) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + nameOfPlayer + "!");
                break;
            }

        }
    }
}