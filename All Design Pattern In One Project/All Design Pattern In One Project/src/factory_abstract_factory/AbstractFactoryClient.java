package factory_abstract_factory;

public class AbstractFactoryClient {
    IAbstractFactory abstractFactory;
    ICar car;
    IMotoCycle motoCycle;

    public AbstractFactoryClient() {
        abstractFactory = new EconomicAbstractFactory();
        car = abstractFactory.createCar();
        motoCycle = abstractFactory.createMoto();

        car.getCarName();
        motoCycle.getCarName();


        abstractFactory = new LuxuryAbstractFactory();

        car = abstractFactory.createCar();
        motoCycle = abstractFactory.createMoto();

        car.getCarName();
        motoCycle.getCarName();

    }

}
