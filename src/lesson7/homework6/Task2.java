package lesson7.homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        2) Написати програму “стрільба по цілі”.
//        Технічні вимоги:
//• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
//• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
//• Сам процес гри обробляється у нескінченному циклі.
//• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
//• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
//• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
//• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв,
//  слід зазначити як *.
//• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
//• Уражену ціль відзначити як x.
//• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
//                Приклад виведення в консоль:
//
//  [0, 1, 2, 3, 4, 5]
//  [1, -, *, -, -, -]
//  [2, -, -, -, -, -]
//  [3, -, *, -, -, -]
//  [4, -, -, *, -, -]
//  [5, -, *, -, -, *]

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetRow = random.nextInt(5) + 1;
        int targetCol = random.nextInt(5) + 1;

        char[][] array = {
                {'0', '1', '2', '3', '4', '5'},
                {'1', '-', '-', '-', '-', '-'},
                {'2', '-', '-', '-', '-', '-'},
                {'3', '-', '-', '-', '-', '-'},
                {'4', '-', '-', '-', '-', '-'},
                {'5', '-', '-', '-', '-', '-'}};

        System.out.println("All Set. Get ready to rumble!");
        System.out.println(targetRow + ":" + targetCol);
        System.out.println();
        while (true) {
            for (int i = 0; i < array.length; i++)
                System.out.println(Arrays.toString(array[i]));

            int shutRow = 0;
            int shutCol = 0;
            while (true) {
                System.out.println("Input Shut Row  1..5 : ");
                if (scanner.hasNextInt()) {
                    shutRow = scanner.nextInt();
                    if (shutRow < 1 || shutRow > 5)
                        System.out.println("Try again. Not in range 1..5");
                    else break;
                } else {
                    System.out.println("Try again. Not an integer.");
                    scanner.nextLine();
                }
            }

            while (true) {
                System.out.println("Input Shut Column  1..5 : ");
                if (scanner.hasNextInt()) {
                    shutCol = scanner.nextInt();
                    if (shutCol < 1 || shutCol > 5)
                        System.out.println("Try again. Not in range 1..5");
                    else break;
                } else {
                    System.out.println("Try again. Not an integer.");
                    scanner.nextLine();
                }
            }

            if (shutRow == targetRow && shutCol == targetCol) {

                System.out.println("YOU HAVE WON !!!");
                array[targetRow][targetCol] = 'x';
                break;
            } else array[shutRow][shutCol] = '*';
        }
        System.out.println();

        for (int i = 0; i < array.length; i++)
            System.out.println(Arrays.toString(array[i]));

        System.out.println();
        System.out.println("Game Over, Bye...");
    }
}
