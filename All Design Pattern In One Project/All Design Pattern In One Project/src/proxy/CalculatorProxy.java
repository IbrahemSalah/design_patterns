package proxy;

import java.util.ArrayList;
import java.util.List;

public class CalculatorProxy implements BaseCalculatorProxy {
    List<Integer> history;
    Calculator calculator;

    public CalculatorProxy() {
        history = new ArrayList<>();
        calculator = new Calculator();
    }

    @Override
    public int sum(int x, int y) {
        int result = calculator.sum(x, y);
        history.add(result);

        return result;
    }
}
