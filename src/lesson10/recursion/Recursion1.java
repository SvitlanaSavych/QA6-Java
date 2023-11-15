package lesson10.recursion;

import java.util.Scanner;

public class Recursion1 {
    // Пользователь вводит положительное число с клавиатуры,
    // а система выводит в консоль все числа от введенного до 0.
    // При решении данной задачи попробовать использовать рекурсию.

    /*    public void recusSout(){
            System.out.println("I am recursion");
            recusSout();
        }*/

    public void insertFromConsoleAndPrint(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        printAllNumbers(scanner.nextInt());
    }


    public void printAllNumbers(int number){
        if(number==0){
            System.out.println(number);
        }
        else if(number<0){
            System.out.println("Below zero");
        }else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }

    }

    public static void main(String[] args) {
        Recursion1 recursion1 = new Recursion1();
        recursion1.insertFromConsoleAndPrint();

    }
}


