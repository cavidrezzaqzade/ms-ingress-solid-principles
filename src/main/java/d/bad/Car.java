package d.bad;

/**
 * This is a violation of dependency inversion principle. Because High level depends on low level. In other words is tightly coupled.
 * @author caci
 */

public class Car {
    Engine engine;

    public Car(){
        engine = new Engine();
    }
}
