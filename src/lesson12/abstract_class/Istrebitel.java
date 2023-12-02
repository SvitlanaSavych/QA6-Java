package lesson12.abstract_class;

public class Istrebitel extends Plane{
    public Istrebitel(String name, int cost, boolean hasPropeller) {
        super(name, cost, hasPropeller);
    }

    @Override
    void move() {
        System.out.println("Кручу пропеллер!");
    }
}
