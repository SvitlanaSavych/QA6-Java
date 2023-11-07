package lesson8;

import java.util.Date;
import java.util.Scanner;

public class Practise2 {
//3) Написать метод, который будет выводить в консоль какое точное время и дата сейчас на вашем устройстве.
//       В формате такого типа: 12 June 2022 year, 14:55

    public void date() {
        Date date = new Date();
        System.out.printf("%1$td %1$tB %1$tY year, %1$tH:%1$tM", date);
        System.out.println();
    }

    public static void main(String[] args) {
        Practise2 day = new Practise2();
        day.date();
        System.out.println("-------------------");
        System.out.println("Your age is " + day.yourCurrentAge());
    }

//    4) Написать метод, который будет просить ввести с клавиатуры ваш год рождения.
//       Данный метод возвращает int который равен вашему возрасту.
//       Используем класс Date как на прошлом занятии.
//       (P.S. пока не затрагиваем момент месяца рождения, останавливаемся только на разнице лет.)
//     ничего не принимает - возвращает int

    public int yourCurrentAge() {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Insert your year of birth:");
        int birth = scanner.nextInt();
        int currentYear = Integer.parseInt(String.format("%tY", date));
        return currentYear - birth;

//           сокращенная запись:
//      System.out.println("Insert your year of birth:");
//      return Integer.parseInt(String.format("%tY", new Date())) - new Scanner(System.in).nextInt();
    }
}


