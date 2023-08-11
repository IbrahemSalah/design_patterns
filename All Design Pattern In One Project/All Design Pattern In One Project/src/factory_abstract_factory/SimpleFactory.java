package factory_abstract_factory;

public class SimpleFactory implements ISimpleFactory {
    @Override
    public ICar createCar(CarType carType) {
        if (carType == CarType.Luxury)
            return new LuxuryCar();
        else if (carType == CarType.Economic)
            return new EconomicCar();
        else
            return new EconomicCar();
    }
}
