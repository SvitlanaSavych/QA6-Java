package lesson2;

public class Increment {
    public static void main(String[] args) {
        //постфиксный инкремент
        int x = 3;
        // x++ equals x = x + 1
        //4
        System.out.println(x);
        int z = 8 + x++;
        System.out.println(z);
        System.out.println(x);

        //префиксный инкремент
        int y = 3;
        System.out.println(y++);
        System.out.println(y);

        //постфиксный декремент
        int u = 7;
        System.out.println(u--);
        System.out.println(u);


        //префиксный декремент
        int u1 = 7;
        System.out.println(--u1);
        System.out.println(u1);

        u1+=7;  // u1 = u1 + 7
        System.out.println(u1);
    }
}
