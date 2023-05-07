package d.good;

/**
 * This is okay. Because high level and low level both depend on abstraction rather than coupling.
 * @author caci
 */

public class Car {
    Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
}
