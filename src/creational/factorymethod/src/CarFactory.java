package creational.factorymethod.src;

public class CarFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Car();
    }
}
