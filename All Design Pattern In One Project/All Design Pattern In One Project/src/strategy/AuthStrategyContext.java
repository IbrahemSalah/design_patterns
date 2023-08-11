package strategy;

public class AuthStrategyContext {
    IBaseAuthStrategy authStrategy;

    void setAuthStrategy(AuthContextEnum authStrategyEnum) {
        if (authStrategyEnum == AuthContextEnum.Social) {
            authStrategy = new SocialConcreteStrategy();
        } else if (authStrategyEnum == AuthContextEnum.Mobile) {
            authStrategy = new MobileConcreteStrategy();
        } else if (authStrategyEnum == AuthContextEnum.Credentials) {
            authStrategy = new CredentialConcreteStrategy();
        }
    }

    public void execute(){
        authStrategy.auth();
    }
}
