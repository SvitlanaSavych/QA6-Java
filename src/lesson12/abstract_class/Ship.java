package lesson12.abstract_class;

public class Ship extends Vehicles{
        public Ship(String name, int cost) {
            super(name, cost);
        }

        @Override
        void move() {
            System.out.println(" I am a Ship. I drive.");
        }

        public static void main(String[] args) {
            Ship ship = new Ship("Titanic", 200000);
            ship.move();
        }
    }

