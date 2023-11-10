package lesson9.homework8.task4;

import java.util.Scanner;

public class Calculator {
    //       4)
//    Создать класс калькулятор.
//    В нем создать методы:
//    summ, minus, multiply, division.
//            Сложение, вычитание, умножение и деление соответственно.
//    Каждый метод принимает в качестве параметров два значения типа double.
//    И выводит в консоль результат действия.
//
//    Также в классе есть метод старт. Который выводит сообщение в консоль, что
//    калькулятор запущен. И предлагает ввести действие в вашей консоли.
//
//    Калькулятор должен принимать только следующие типы действий:
//            2+4;    - пример синтаксиса сложения;
//            5-6;    - пример синтаксиса вычитания;
//            25*3;   - пример синтаксиса умножения;
//            34/3;   - пример синтаксиса деления;
//
//    После ввода действия на консоль выводится ответ этого действия.
//    И после снова выводится сообщение о предложении ввести действие.
//
//    В случае ввода другого синтаксисана консоль возвращается сообщение:
//            "Введите корректное действие".
//    И после снова выводится сообщение о предложении ввести действие.
//
//    Программа закрывается после ввода команды Stop.
//    Перед закрытием на консоль должно выводится сообщение:
//            "Калькулятор закрыт".

    public double summ(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double division(double number1, double number2) {
        return number1 / number2;
    }

    public void start() {
        System.out.println("Калькулятор запущен");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите операцию:");
            String operation = scanner.nextLine();
            if (operation.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            }
            char charOperation = '?';
            if (operation.indexOf('+') > -1) {
                charOperation = '+';
            } else if (operation.indexOf('-') > -1) {
                charOperation = '-';
            } else if (operation.indexOf('*') > -1) {
                charOperation = '*';
            } else if (operation.indexOf('/') > -1) {
                charOperation = '/';
            }
            if (charOperation == '?') {
                System.out.println("Введите корректное действие.");
                continue;
            }


            String[] numbers = operation.split("\\"+charOperation);
            if (numbers.length < 2 || numbers.length > 2) {
                System.out.println("Ошибочное действие.");
                continue;
            }

            double number1 = Double.parseDouble(numbers[0]);
            double number2 = Double.parseDouble(numbers[1]);
            double result = 0;
            switch (charOperation) {
                case '+':
                    result = summ(number1, number2);
                    break;
                case '-':
                    result = minus(number1, number2);
                    break;
                case '*':
                    result = multiply(number1, number2);
                    break;
                case '/':
                    if (number2 == 0) {
                        System.out.println("На ноль делить нельзя!");
                        continue;
                    }
                    result = division(number1, number2);
                    break;
                default:
                    System.out.println("Неизвестная операция: " + charOperation);
                    break;
            }
            System.out.println("Результат: " + result);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}