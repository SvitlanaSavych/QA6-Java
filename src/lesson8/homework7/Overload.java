package lesson8.homework7;

import java.util.Arrays;

public class Overload {
//     2)
//  Написать перегруженный метод, который может:
//
//•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
//•	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//•	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
//•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
//•	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
// "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

    public void methodOverload() {
        System.out.println("Я пустой");
    }

    public void methodOverload(String text) {
        System.out.println("Я метод с параметром String: " + text);
    }

    public void methodOverload(String[] arrayStrings) {
        for (int i = 0; i < arrayStrings.length; i++)
            System.out.print(arrayStrings[i] + " ");
        System.out.println();
    }

    public void methodOverload(int[] arrayNumbers) {
        int sum = 0;
        for (int i = 0; i < arrayNumbers.length; i++)
            sum = sum + arrayNumbers[i];
        System.out.println("Я метод с параметром массив чисел из суммой элементов - " + sum);
    }

    public void methodOverload(int number, String text) {
        System.out.printf("Ваше сообщение - %s, ваше число - %d", text, number);
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.methodOverload();
        overload.methodOverload("Я пустой");
        overload.methodOverload(new String[]{"Paris", "London", "Kyiv", "Berlin", "Kassel"});
        overload.methodOverload(new int[]{285, 987, 528, 31, 47});
        overload.methodOverload(3, "I have cats");
    }
}

