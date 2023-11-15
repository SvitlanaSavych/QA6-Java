package lesson10;

import java.util.Scanner;

public class Bear {
//    Создать класс Bear. В нем поля имя, возраст и пол (boolean). Поля приватные.
//    Создать конструктор для задания имени и пола. Для Возраста задать
//    геттеры и сеттеры.
//    Создать метод voice, который выводит в консоль сообщение "RRRRRRRR!!!!"
//
//    Создать метод makeBabyBear, который в свои параметры требует объект
//    класса Bear, строку и boolean.
//    Если пол у медведей совпадает, то тогда возвращается новый медведь с пустым именем.
//            (поле пол можете оставить любым). Если пол разный, то возвращается новый медведь
//    с именем и полом, которые он получает из аргументов переданных в параметры метода.
//
//    Переопределить метод toString() который в случае если у медведя поле имени равно
//    null, возвращает строку типа: "Я не мог быть рожден", в противном случае он
//    возвращает информацию о медведе.

    private String name;
    private int age;
    private boolean female;

    public Bear(String name, boolean female) {
        this.name = name;
        this.female = female;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void voice(){
        System.out.println("RRRRRRRR!!!!");
    }
    public Bear makeBabyBear(Bear bear, String name, boolean female){
        if (this.female == bear.female){
            return new Bear(null, true);
        }else{
            return new Bear(name, female);
        }
    }

    @Override
    public String toString() {
        if (name == null) {
            return "Я не мог быть рожден";
        }else {
            return "Bear{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", female=" + female +
                    '}';
        }
    }
    public static void main(String[] args) {
        Bear male1 = new Bear("Male1", false);
        Bear male2 = new Bear("Male2", false);
        Bear female = new Bear("Female", true);

        Bear microBear1 = male1.makeBabyBear(female, "MicroBear1", true);
        System.out.println(microBear1);

        System.out.println("============");
        Bear microBear2 = male1.makeBabyBear(male2, "MicroBear2", true);
        System.out.println(microBear2);

    }

    public static class WeekPlanner1 {
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
        public void setGoals(String[][] schedule){
            Scanner scanner = new Scanner(System.in);
            for ( int i = 0; i < schedule.length; i++){
                String a = scanner.nextLine();
                schedule[i][1] = a;
            }


        }

        public static void main(String[] args) {

        }
    }
}
