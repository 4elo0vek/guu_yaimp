public class Main {
    public static void main(String[] args) {
        Liquid water = new Liquid("Вода", 1000.0);
        water.changeDensity(5.0);
        water.setName("Дистилированная вода");
        Alcohol ethanol = new Alcohol("Этанол", 789.0, 96.0);
        ethanol.changeStrength(-1.0);
        ethanol.setDensity(790.0);
        System.out.println(water.toString());
        System.out.println(ethanol.toString());
    }
