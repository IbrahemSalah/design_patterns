package factory_abstract_factory;

public class LuxuryAbstractFactory implements IAbstractFactory{


    @Override
    public ICar createCar() {
        return new LuxuryCar();
    }

    @Override
    public IMotoCycle createMoto() {
        return new LuxuryMoto();
    }
}
