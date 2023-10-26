package lesson5.homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//      3)
//   Написать программу, условно для склада приема металла. Представим, что склад может хранить
//   определенный вес металла. Пользователь вводит с клавиатуры вес, который может хранится на складе.
//   Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь.
//   Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад.
//   Если пользователь хочет сдать металла больше чем осталось места на складе, то программа не дает
//   ему это сделать и уведомляет пользователя, о невозможности данной операции. Если пользователь сдает
//   металл весом меньше чем 5, программа тоже предупреждает о невозможности приемки такого малого веса.
//    Программа завершается, когда место на складе закончилось.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите вместимость склада");
        int weightOfWarehouse = scanner.nextInt();
        int weight = 0;
        while (weight <= weightOfWarehouse) {
            if (weight == weightOfWarehouse) {
                System.out.println("Склад заполнен");
                break;
            }
            System.out.println("Сколько металла вы хотите сдать на склад?");
            int metalsWeight = scanner.nextInt();
            if (weight + metalsWeight > weightOfWarehouse) {
                System.out.println("Данная операция невозможна");
                System.out.println("Склад может еще принять: "+ (weightOfWarehouse - weight));
                continue;
            }
            if (metalsWeight <= 5) {
                System.out.println("Склад не может принять такой маленький вес");
                System.out.println("Склад может еще принять: " + (weightOfWarehouse - weight));
                continue;
            }
            weight = weight + metalsWeight;
            System.out.println("Склад может еще принять: " + (weightOfWarehouse - weight));
        }

    }
}