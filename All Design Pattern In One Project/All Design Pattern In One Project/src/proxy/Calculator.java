package proxy;

public class Calculator implements BaseCalculatorProxy {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }
}
