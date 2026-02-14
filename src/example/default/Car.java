import Simple_Client_Code.Driver;
import Simple_Client_Code.Model;
import Simple_Client_Code.Wheels;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Driver driver; // 0..1 association
    private List<Wheels> wheels = new ArrayList<>(); // 1..* composition
    private Model model;

}
