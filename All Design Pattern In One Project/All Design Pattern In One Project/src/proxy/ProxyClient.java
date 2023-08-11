package proxy;

public class ProxyClient {

    CalculatorProxy calculatorProxy;

    public ProxyClient() {
        calculatorProxy = new CalculatorProxy();
        calculatorProxy.sum(3, 4);
        System.out.println(calculatorProxy.history.get(0));
    }
}
