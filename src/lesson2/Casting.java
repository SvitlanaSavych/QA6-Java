package lesson2;

public class Casting {
    public static void main(String[] args) {
        byte myByte = 100;
        int myInt = myByte;
        System.out.println(myInt);

        int myInt2 = 130;
        byte myByte2 = (byte) myInt2;
        System.out.println(myByte2);

        //char
        char myChar = 'W';
        char myChar2 = 'w';
        System.out.println(myChar);

        int myCharInteger = myChar;
        int myCharInteger2 = myChar2;
        System.out.println(myCharInteger);
        System.out.println(myCharInteger2);
    }
}
