package factory_abstract_factory;

public class EconomicAbstractFactory implements IAbstractFactory {


    @Override
    public ICar createCar() {
        return new EconomicCar();
    }

    @Override
    public IMotoCycle createMoto() {
        return new EconomicMoto();
    }
}
