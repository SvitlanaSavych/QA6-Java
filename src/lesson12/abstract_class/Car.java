package lesson12.abstract_class;

public class Car extends Vehicles{

        public Car(String name, int cost) {
            super(name, cost);
        }

        @Override
        void move() {
            System.out.println(" I am a Car. I drive.");
        }
    }


