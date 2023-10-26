package lesson5.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        1)
//    Написать программу, которая будет считывать введенные пользователем слова с клавиатуры,
//    и склеивать их в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.
//    Все слова введенные до этого должны отобразится в консоли одним предложением.

        Scanner wordScanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String valueWords = wordScanner.nextLine();
        String result = "";
        while (!valueWords.equals("STOP")) {
            result = result.concat(valueWords);
            System.out.println("Enter the word:");
            valueWords = wordScanner.nextLine();
        }
        System.out.println(result);
    }

}
