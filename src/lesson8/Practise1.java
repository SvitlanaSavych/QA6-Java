package lesson8;

public class Practise1 {
//      1) Написать метод, принимающий в качестве параметров два числа,
//            который будет выводить на консоль сумму этих двух чисел.
//         принимает - не возвращает
//
    public void integer(int a, int b){
        System.out.println(a + b);
    }



//      2) Написать второй метод, который будет возвращать сумму двух чисел,
//              которые он будет принимать в параметре метода.
//         принимает - возвращает

    public int integer2 (int a, int b){
        return a + b;
    }



    public static void main(String[] args) {
//        1)

        Practise1 i = new Practise1();
        i.integer(4,6);


//        2)

        int g = i.integer2(5,8);
        System.out.println(g);
    }
    }


