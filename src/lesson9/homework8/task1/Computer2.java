package lesson9.homework8.task1;

public class Computer2 {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", 34000, 8, 12);
        Computer computer2 = new Computer("Lenovo", 25000, 8, 12);
        System.out.println(computer);
        System.out.println("-------------------");
        System.out.println(computer.hashCode());
        System.out.println(computer2.hashCode());
        System.out.println(computer.equals(computer2));
    }
}

