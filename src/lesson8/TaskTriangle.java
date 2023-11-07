package lesson8;

import java.util.Scanner;

public class TaskTriangle {
    public static void main(String[] args) {
//  Необходимо вывести на экран перевернутый прямоугольный треугольник прямым углом сверху в левой части.
//  Для вывода использовать условные операторы, циклы.
//  Команду System.out.println(); System.out.print(); и можно использовать только с одним символом *.
//  Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
//   а программа выводит сам треугольник.
//                Пример с числом 7:
//                *******
//                ******
//                *****
//                ****
//                ***
//                **
//                *
//                *******
//                *    *
//                *   *
//                *  *
//                * *
//                **
//                *

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int integer = scanner.nextInt();
        for (int i = integer; i > 0; i--){
            System.out.println("");
            for (int j = i; j > 0; j--){
                char char1 = '*';
                System.out.print(char1);

            }
        }

    }
}