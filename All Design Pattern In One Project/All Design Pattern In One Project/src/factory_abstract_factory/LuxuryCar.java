package factory_abstract_factory;

public class LuxuryCar implements ICar{
    @Override
    public void getCarName() {
        System.out.println("Luxury Car Instance");
    }
}
