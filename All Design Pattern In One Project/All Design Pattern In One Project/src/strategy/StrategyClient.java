package strategy;

public class StrategyClient {

    AuthStrategyContext authStrategyContext;

    public StrategyClient(){
        authStrategyContext = new AuthStrategyContext();
        authStrategyContext.setAuthStrategy(AuthContextEnum.Credentials);
        authStrategyContext.execute();
    }
}
