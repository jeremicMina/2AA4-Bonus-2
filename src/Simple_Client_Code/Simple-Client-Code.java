package Simple_Client_Code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a Simple_Client_Code.Car
        Car car = new Car();
        car.setModel(Model.TESLA);

        // 0..1 association: Simple_Client_Code.Car → Simple_Client_Code.Driver
        Driver d = new Driver();
        car.setDriver(d);

        // 1..* composition: Simple_Client_Code.Car → Simple_Client_Code.Wheels
        car.getWheels().add(new Wheels());
        car.getWheels().add(new Wheels());

        // Inheritance: Simple_Client_Code.Manual and Simple_Client_Code.Automatic extend Simple_Client_Code.Car
        Manual m = new Manual();
        m.setModel(Model.BMW);
        m.setDriver(new Driver());
        m.getWheels().add(new Wheels());

        Automatic a = new Automatic();
        a.setModel(Model.TOYOTA);
        a.setDriver(new Driver());
        a.getWheels().add(new Wheels());

        // Output to verify everything works
        System.out.println("Simple_Client_Code.Car model: " + car.getModel());
        System.out.println("Simple_Client_Code.Manual model: " + m.getModel());
        System.out.println("Simple_Client_Code.Automatic model: " + a.getModel());
    }
}
public class Automatic extends Car {

    // Inherits everything from Simple_Client_Code.Car
}
public class Manual extends Car {

    // Inherits everything from Simple_Client_Code.Car
}
public class Wheels {

    // Minimal class for the PoC
}
public class Driver {

    // Minimal class for the PoC
}
public enum Model {
    TESLA, BMW, TOYOTA
}

public class Car {

    private Driver driver;                 // 0..1 association
    private List<Wheels> wheels;           // 1..* composition
    private Model model;                   // enum

    public Car() {
        this.wheels = new ArrayList<>();   // ensures 1..* possible
    }

    // Simple_Client_Code.Driver (0..1)
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    // Simple_Client_Code.Wheels (1..*)
    public List<Wheels> getWheels() {
        return wheels;
    }

    // Simple_Client_Code.Model enum
    public void setModel(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }
}

