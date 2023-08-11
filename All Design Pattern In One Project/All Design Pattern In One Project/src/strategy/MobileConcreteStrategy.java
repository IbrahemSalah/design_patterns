package strategy;

public class MobileConcreteStrategy implements IBaseAuthStrategy{
    @Override
    public void auth() {
        System.out.println("Authenticated using Mobile");
    }
}
