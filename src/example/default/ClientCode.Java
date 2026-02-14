import Simple_Client_Code.Car;
import Simple_Client_Code.Driver;
import Simple_Client_Code.Model;
import Simple_Client_Code.Wheels;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.setModel(Model.TESLA);

        Driver d = new Driver();
        c.setDriver(d);

        c.getWheels().add(new Wheels());
        c.getWheels().add(new Wheels());
    }
}
