public class Alcohol extends Liquid {
    private double strength;

    public Alcohol(String name, double density, double strength) {
        super(name, density);
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void changeStrength(double delta) {
        this.strength += delta;
    }
}
