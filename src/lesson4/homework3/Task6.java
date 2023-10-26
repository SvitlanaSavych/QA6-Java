package lesson4.homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//      6)
//     Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
//     Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
//     Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
//     а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение в консоль,
//     о том что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение в консоль,
//     о том что такой ОС не существует.

        Scanner scanner = new Scanner(System.in);
        System.out.println("What program are you interested in (IntelliJ IDEA, Git, Java)?");
        String program = scanner.nextLine();
        switch (program.toLowerCase()) {
            case ("intellij idea"):
                System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                break;
            case ("git"):
                System.out.println("https://git-scm.com/downloads");
                break;
            case ("java"):
                System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                break;
            default:
                System.out.println("There is no such program.");
        }
        System.out.println("What OS are you using (Linux, macOS, Windows)?");
        String os = scanner.nextLine();
        switch (os.toLowerCase()){
            case ("linux"):
                System.out.println("https://www.linux.org/");
                break;
            case ("macos"):
                System.out.println("https://www.teamviewer.com/ru-cis/download/macos/");
                break;
            case ("windows"):
                System.out.println("https://www.microsoft.com/uk-ua/software-download/windows11");
                break;
            default:
                System.out.println("There is no such OS.");
        }
    }
}
