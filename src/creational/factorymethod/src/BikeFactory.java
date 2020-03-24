package creational.factorymethod.src;

public class BikeFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Bike();
    }
}
