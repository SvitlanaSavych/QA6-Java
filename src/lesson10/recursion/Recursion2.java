package lesson10.recursion;

import java.util.Scanner;

public class Recursion2 {
    //  Пользователь вводит с клавиатуры сумму, которую он хочет взять в кредит, а также сумму
    //  которую он будет выплачивать каждый месяц. В консоль выводится порядковый номер месяца,
    //  и сумма оставшаяся для выплаты кредита. Как только кредит погашен, в консоль выводится фраза:
    //  Кредит погашен за {кол-во месяцев}.

    public void payed (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert two numbers");
        int insertSumOfCredit = scanner.nextInt();
        int insertReturnMoneyPerMonth = scanner.nextInt();
        credit(insertSumOfCredit,insertReturnMoneyPerMonth,1);
    }
    public void credit (int sumOfCredit, int returnMoney, int counter){

        sumOfCredit = sumOfCredit - returnMoney;
        System.out.println("Month " + counter + " You need to pay " + sumOfCredit);

        if (sumOfCredit <= 0){
            System.out.println("Credit already done " + counter  + " month");
        }
        else {
            counter++;
            credit(sumOfCredit,returnMoney,counter);
        }

    }

    public static void main(String[] args) {
        Recursion2 credit = new Recursion2();
        credit.payed();
    }
}


