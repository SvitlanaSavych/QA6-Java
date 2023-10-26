package lesson7;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        String number1 = scanner.nextLine();
        String number2 = "";
        for (int i = number1.length()-1; i >=0; i-- ){
            number2 = number2 + number1.charAt(i);
        }
        System.out.println(number2);

        if(number2.equals(number1)){
            System.out.println("Palindrome");
        } else {
            System.out.println("No palindrome");
        }
    }

}


