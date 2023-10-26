package lesson6;

public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        int tomorrowDate = Integer.parseInt(String.format("%td", date))+1;
        System.out.println(tomorrowDate);
    }
}


