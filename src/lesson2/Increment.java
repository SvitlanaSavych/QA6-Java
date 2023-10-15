package lesson2;

public class Increment {
    public static void main(String[] args) {
        //постфиксный инкремент
        int x = 3;
        // x++ equals x = x + 1
        System.out.println(x++);  // 3
        System.out.println(x);    // 4
        System.out.println(x++);  // 4
        int z = 8 + x++;
        System.out.println(z);  // 13
        System.out.println(x);  // 6

        //префиксный инкремент
        int y = 3;
        System.out.println(++y);  // 4
        System.out.println(y);    // 4

        //постфиксный декремент
        // u-- equals u = u - 1
        int u = 7;
        System.out.println(u--);  // 7
        System.out.println(u);    // 6

        //префиксный декремент
        int u1 = 7;
        System.out.println(--u1);  // 6
        System.out.println(u1);    // 6

        u1+=7;  // u1 = u1 + 7
        System.out.println(u1);  // 13
    }
}
