package lesson11.homework10.task2;

import java.util.Random;
import java.util.Scanner;

public class Result {
//    2)
//   Создать метод, в котором создается одномерный массив типа int произвольного размера от 1 до 30,
//   в котором каждому элементу массива присваивается произвольное значение от 0 до 30.
//   Данный метод спрашивает у пользователя ввести с клавиатуры индекс случайно сгенерированного массива.
//   Метод возвращает значение типа double, которое получается при делении элемента с указанным индексом
//   пользователя на первый элемент данного массива.
//
//   Продумать все возможные исключительные ситуации, которые могут возникнуть в данном методе.
//   Для каждой исключительной ситуации создать собственный класс checked исключения.
//   Прописать в методе условия генерации данных исключений, а также указать их в сигнатуре данного метода.
//
//   Обработку исключения осуществить в сторонеем классе Main в котором нужно вызвать данный метод.

    public static double divisionResult() throws InvalidIndexException, ArrayZeroDivisionException, WrongInputException {
        Random random = new Random();
        int[] arrayNumber = new int[random.nextInt(30) + 1];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(30);
        }
        System.out.println("Array length: " + arrayNumber.length);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of array: ");

        while (!scanner.hasNextLine());
        if (!scanner.hasNextInt()) {
            throw new WrongInputException("Invalid input. Enter valid integer.");
        }
        int index = scanner.nextInt();
        if (index < 0 || index >= arrayNumber.length) {
            throw new InvalidIndexException("Invalid index. It should be from 0 till " + (arrayNumber.length - 1));
        }
        if (arrayNumber[index] == 0) {
            throw new ArrayZeroDivisionException("Division by zero. The first element of array is zero.");
        }
        return (double) arrayNumber[index] / arrayNumber[0];
    }
}

