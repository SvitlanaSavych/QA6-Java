package lesson10.homework9;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Human mother1 = new Human("Karina", "Moroz", 2001);
        Human mother2 = new Human("Olga", "Ivanova", 1984);
        Human mother3 = new Human("Natalia", "Petrova", 1980);

        Human father1 = new Human("Max", "Moroz", 1999, new Random().nextInt(100));
        Human father2 = new Human("Petr", "Ivanov", 1982, new Random().nextInt(100));
        Human father3 = new Human("Evgen", "Petrov", 1979, new Random().nextInt(100));

        Pet pet1 = new Pet("cat", "Matilda", 3, new Random().nextInt(100),new String[]{"eat sausage", "drink milk", "sleep", "jump"});
        Pet pet2 = new Pet("cat", "Bella", 2, new Random().nextInt(100), new String[]{"eat meat", "drink milk", "always purrs"});
        Pet pet3 = new Pet("bird", "Gosha");

        Family moroz = new Family(mother1, father1);
        Family ivanov = new Family(mother2, father2);
        Family petrov = new Family(mother3, father3);

        Human child1 = new Human("Alina","Moroz",2021, new Random().nextInt(100), moroz);
        Human child2 = new Human("Vlad", "Ivanov", 2004, new Random().nextInt(100), ivanov);
        Human child3 = new Human("Marina", "Ivanova", 2006, new Random().nextInt(100), ivanov);
        Human child4 = new Human("Elena", "Petrova", 2010, new Random().nextInt(100), petrov);


        moroz.addChild(child1);
        ivanov.addChild(child2);
        ivanov.addChild(child3);
        petrov.addChild(child4);

        moroz.setPet(pet1);
        ivanov.setPet(pet3);
        petrov.setPet(pet2);

        System.out.println(moroz.countFamily());
        System.out.println(petrov.countFamily());
        System.out.println(ivanov.countFamily());
        System.out.println("------------");
        ivanov.deleteChild(0);
        System.out.println(ivanov.countFamily());
        System.out.println("---------------");

        System.out.println(child1.getFamily());
        System.out.println(child2.getFamily());
        System.out.println(child3.getFamily());
        System.out.println(child4.getFamily());

        System.out.println("---------------");
        System.out.println(mother1);
        System.out.println(mother2);
        System.out.println(mother3);
        System.out.println("---------------");
        System.out.println(father1);
        System.out.println(father2);
        System.out.println(father3);
        System.out.println("---------------");
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(child4);
        System.out.println("---------------");
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println("---------------");

        System.out.println(pet1.getTrickLevel());
        System.out.println(pet2.getTrickLevel());
        System.out.println(pet3.getTrickLevel());

        pet1.eat();
        pet2.respond();
        pet3.foul();

        child1.greetPet();
        child3.feedPet();
        child4.describePet();

        child1.getFamily().setPet(pet1);
        child3.getFamily().setPet(pet3);
        child4.getFamily().setPet(pet2);

        System.out.println("---------------");
        System.out.println(pet1.hashCode());
        System.out.println(pet2.hashCode());
        System.out.println(pet1.equals(pet2));

        System.out.println(pet2.hashCode());
        System.out.println(pet3.hashCode());
        System.out.println(pet2.equals(pet3));

        System.out.println(mother1.hashCode());
        System.out.println(father1.hashCode());
        System.out.println(mother1.equals(father1));

        System.out.println(mother1.hashCode());
        System.out.println(father3.hashCode());
        System.out.println(mother1.equals(father3));
        System.out.println("---------------");

        System.out.println(child1.getFamily().getMother().getName());
        System.out.println(child1.getFamily().getFather().getName());

        System.out.println(child3.getFamily().getMother().getName());
        System.out.println(child3.getFamily().getFather().getName());

        System.out.println(child4.getFamily().getMother().getName());
        System.out.println(child4.getFamily().getFather().getName());

        System.out.println(child2.getFamily());
    }
}
