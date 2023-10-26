package lesson5;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {

//        Написать программу, которая будет просить ввести пользователя с клавиатуры число до тех пор
//        пока он не введет число 13. Также программа будет выводить в консоль число, введеное пользователем,
//        если оно четное.

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        while (x != 13) {
//            System.out.println("Введите число!");
//            x = scanner.nextInt();

//            2) Создать бесконечный цикл, который будет спрашивать ввести у пользователя
//            с клавиатуры число, и суммировать все введенные пользователем числа до тех пор,
//            пока он не введет с клавиатуры слово FINAL.
//            Конечную сумму программа должна вывести в консоль после завершения цикла.

//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        String value = x.nextLine();
//        int result = 0;
//        while (!value.equals ("Finel")){
//            result = result + Integer.parseInt(value);
//            System.out.println("Enter your number:");
//            value = x.nextLine();
//        }
//        System.out.println(result);

        /*    5)Пользователь вводит с клавиатуры число, а на консоль выводится квадрат из звездочек
    со стороной равной этому числу.
    Пример: Пользователь ввел 5, вывод в консоль:
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++){

           for (int a = 0; a < x; a++){
               System.out.print("* ");
           }
            System.out.println();
        }


    }
}
