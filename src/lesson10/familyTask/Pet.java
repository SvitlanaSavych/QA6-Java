package lesson10.familyTask;

import java.util.Random;

public class Pet {
    public int trickLevel = new Random().nextInt(100);

    public Pet(String name) {
        this.name = name;
    }

    private String name;

    public void respond(){
        System.out.println("Привіт, хазяїн. Я - "+ name +". Я скучив!");
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Dog");
        Pet pet2 = new Pet("Cat");
        Pet pet3 = new Pet("Bird");
        System.out.println(pet3.trickLevel);
        System.out.println(pet2.trickLevel);
        System.out.println(pet1.trickLevel);

        pet1.respond();
        pet2.respond();
        pet3.respond();
    }
}
