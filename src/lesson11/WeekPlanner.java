package lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class WeekPlanner {
//               Написать класс WeekPlanner
//    В данном классе написать метод getSchedule(),  возвращающий двумерный массив размерностью 7х2
//    В данном массиве инициализируются элементы, которые будут отвечать за дни недели.
//    schedule[0][0] = "Sunday";
//    schedule[1][0] = "Monday";
//    schedule[2][0] = "Tuesday";
//    schedule[3][0] = "Wednesday";
//    schedule[4][0] = "Thursday";
//    schedule[5][0] = "Friday";
//    schedule[6][0] = "Saturday";
//
//    Остальные элементы массива будут отвечать за задания в планировщике на эти дни.
//
//    Написать метод setGoals(), который принимает в параметры двумерный массив размерностью 7х2,
//    и спрашивает с клавиатуры задать цели для каждого дня недели чтобы вышло как в данном примере:
//    schedule[0][1] = "do home work";
//    schedule[1][1] = "go to courses; watch a film";
//    и т.д
//
//    Написать метод workWithSchedule() который используя цикл и оператор switch, спросит
//    у пользователя день недели c консоли в зависимости от ввода будет отрабатывать следующим образом:
//    программа: Please, input the day of the week:
//    пользователь вводит корректный день недели (f.e. Monday)
//    программа выводит на экран: Your tasks for Monday: go to courses; watch a film.;
//    программа идет на следующую итерацию;
//    программа: Please, input the day of the week:
//    пользователь вводит некорректный день недели (f.e. %$=+!11=4)
//    программа выводит на экран Sorry, I don't understand you, please try again.;
//    программа идет на следующую итерацию до успешному ввода;
//    программа: Please, input the day of the week:
//    пользователь выводит команду выхода exit
//    программа выходит из цикла и корректно завершает работу.
//
//    Обратите внимание: программа должна принимать команды как в нижнем регистре (monday), так и в верхнем (MONDAY)
//    и учтите, что пользователь мог случайно после дня недели ввести пробел*/
/*       Добавте в метод логику, чтобы при вводе пользователем фразы change
       [day of the week] или reschedule [day of the week],
       программа предложила ввести новые задания для данного дня недели
       и сохранила их в соответствующем месте массива, удалив при этом старые задачи.
       После этого программа следует на следующую итерацию до ввода exit.

        программа: Please, input the day of the week:

        Пользователь вводит: change Monday

        Программа предлагает ввести новые задачи на понедельник: Please, input new tasks for Monday.

        Пользователь вводит новые задачи в консоль;
        программа сохраняет новые задачи в соответствующую ячейку;
        программа пошла на новую итерацию и при вводе Monday выдает уже новые задачи.*/

    public String[][] getSchedule() {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        return schedule;
    }

    public void setGoals(String[][] schedule) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < schedule.length; i++) {
            System.out.println("Insert goal for " + schedule[i][0]);
            schedule[i][1] = scanner.nextLine();
        }
    }
    public void workWithSchedule(String[][] schedule){
        System.out.println("Please, input the day of the week");
        Scanner scanner  = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        while (!input.equalsIgnoreCase("exit")){

            if(input.contains("change")||input.contains("reschedule")){
                String day = input.split("\\s")[1];

                for (int i = 0; i < schedule.length; i++){
                    if(schedule[i][0].equalsIgnoreCase(day)){
                        System.out.println("Please, input new tasks for " + schedule[i][0]);
                        schedule[i][1] = scanner.nextLine();
                        break;
                    }
                }
                input = day;
            }

            switch (input.toLowerCase()) {
                case "sunday" -> System.out.println(schedule[0][1]);
                case "monday" -> System.out.println(schedule[1][1]);
                case "tuesday" -> System.out.println(schedule[2][1]);
                case "wednesday" -> System.out.println(schedule[3][1]);
                case "thursday" -> System.out.println(schedule[4][1]);
                case "friday" -> System.out.println(schedule[5][1]);
                case "saturday" -> System.out.println(schedule[6][1]);
                default -> System.out.println("Sorry, I don't understand you, please try again.");
            }
            System.out.println("Please, input the day of the week");
            input = scanner.nextLine().trim();
        }
    }

    public static void main(String[] args) {
        WeekPlanner weekPlanner = new WeekPlanner();
        String[][] schedule = weekPlanner.getSchedule();
        weekPlanner.setGoals(schedule);
        System.out.println(Arrays.deepToString(schedule));
        weekPlanner.workWithSchedule(schedule);
        System.out.println(Arrays.deepToString(schedule));
    }
}

