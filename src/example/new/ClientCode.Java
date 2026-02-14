public class Main {
    public static void main(String[] args) {

        Garage g = new Garage();
        Car c = new Car();
        Mechanic m = new Mechanic();

        g.getCars().add(c);
        c.getMechanics().add(m);
    }
}
