package lesson5.homework4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        4)
// Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.
// Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
// Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
// Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
// Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”
// Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”

        Scanner scanner = new Scanner(System.in);

        String [] arrayName = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int [] arrayTime = {10, 12, 14, 16, 18, 20};
        String [] arrayPlace = {"школу", "магазин", "церковь", "тренажёрный зал", "кино", "поликлинику"};

        String result = "%1$s будет идти в %2$s в %3$d";

        int name;
        do {
            System.out.println("Insert number from 0 till 6:");
            int x = scanner.nextInt();
            name = x;
        }while (name < 0 || name > arrayName.length-1);
        System.out.println(arrayName[name]);

        int time;
        do {
            System.out.println("Insert number from 0 till 5:");
            int x = scanner.nextInt();
            time = x;
        } while (time < 0 || time > arrayTime.length-1);

        int place;
        do {
            System.out.println("Insert number from 0 till 5:");
            int x = scanner.nextInt();
            place = x;
        } while (place < 0 || place > arrayPlace.length-1);

        System.out.printf(result,arrayName[name],arrayPlace[place],arrayTime[time]);
    }
}

