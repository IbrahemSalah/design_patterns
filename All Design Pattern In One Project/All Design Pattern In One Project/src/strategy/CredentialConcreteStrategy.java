package strategy;

public class CredentialConcreteStrategy implements IBaseAuthStrategy {
    @Override
    public void auth() {
        System.out.println("Credential using Mobile");
    }
}

