package strategy;

public class SocialConcreteStrategy implements IBaseAuthStrategy {
    @Override
    public void auth() {
        System.out.println("Auth using Social");
    }
}
