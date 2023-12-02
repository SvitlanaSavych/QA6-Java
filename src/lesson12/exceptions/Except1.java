package lesson12.exceptions;

public class Except1 {
    public static void main(String[] args) {
     /*  //ArithmeticException
        System.out.println(14/0);*/


/*        // ArrayIndexOutOfBoundsException
        int[] array = new int[5];
        System.out.println(array[100]);*/


/*        //NullPointerException
        Person person = null;
        person.getName();*/

        try {
            int x = 15;
            int y = 0;
            int z = x/y;
            System.out.println("qwerty");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Final");
        }

        System.out.println("to be continued...");
    }

}


