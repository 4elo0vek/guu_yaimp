public class Liquid {
    private String name;
    private double density;

    public Liquid(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void changeDensity(double delta) {
        this.density += delta;
    }
}
