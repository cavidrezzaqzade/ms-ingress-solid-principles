package l.bad;

/**
 * @author caci
 */

public class ElectricCar implements Car {

    //this is a violation of liskov substitution principle
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        //this acceleration is crazy!
    }
}
