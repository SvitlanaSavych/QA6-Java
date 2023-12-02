package lesson12.abstract_class;

public abstract class Plane extends Vehicles {
    public Plane(String name, int cost, boolean hasPropeller) {
        super(name, cost);
        this.hasPropeller = hasPropeller;

    }

    public boolean isHasPropeller() {
        return hasPropeller;
    }

    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    private boolean hasPropeller;
}


