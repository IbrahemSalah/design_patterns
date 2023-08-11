package factory_abstract_factory;

public class EconomicCar implements ICar {
    @Override
    public void getCarName() {
        System.out.println("Economic Car Instance");
    }
}
