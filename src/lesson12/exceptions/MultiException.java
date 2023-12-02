package lesson12.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    //    Нужно делить число, введенное с клавиатуры, на индекс из массива.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {12, 23, 36, 3, 0, 134, 6};
        System.out.println("Insert index:");
        try {
            System.out.println(212123 / array[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Выход за пределы массива.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Деление на ноль.");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка ввода данных");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Выход за пределы массива.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Exception");
        }


        System.out.println("Exit");
        String s = "lkjk";
        System.out.println(s.charAt(234));
    }
}


