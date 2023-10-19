package lesson3.homework2;

public class Task1 {
    public static void main(String[] args) {
//        1)
//        Создать переменную string1 = "This line that i want to cut, cause it is too long".
//        Создать строку string2 в которой должно быть помещено значение строки string1,
//        обрезанное до "This line that i want to cut, cause".
//        Создать строку string3 на основе string2 которое будет содержать значение
//        "This line that don't want to cut, cause it is perfect".
//        Вывести на консоль каждое сообщение и его длину.

        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2.replace(" i "," don't ").concat(" " + "it is perfect");
        System.out.println(string1 + " - " + string1.length());
        System.out.println(string2 + " - " + string2.length());
        System.out.println(string3 + " - " + string3.length());
    }
}

