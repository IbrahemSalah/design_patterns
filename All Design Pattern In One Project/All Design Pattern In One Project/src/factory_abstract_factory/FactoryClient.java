package factory_abstract_factory;

public class FactoryClient {


    public FactoryClient() {

        ISimpleFactory iSimpleFactory = new SimpleFactory();
        ICar car = iSimpleFactory.createCar(CarType.Economic);
        car.getCarName();

        car = iSimpleFactory.createCar(CarType.Luxury);
        car.getCarName();
    }
}
