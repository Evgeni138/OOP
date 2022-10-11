package calculator.Models;

public class CalculationNumber implements Calculation {

    @Override
    public String sum(Number x, Number y) {
        if (x.b == 0 || y.b == 0)
            return String.valueOf(x.a + y.a);
        else return String.valueOf(x.a + y.a) + "+" + String.valueOf(x.b + y.b) + "i";
    }

    @Override
    public String sub(Number x, Number y) {
        if (x.b == 0 || y.b == 0)
            return String.valueOf(x.a - y.a);
        else return String.valueOf(x.a - y.a) + "+" + String.valueOf(x.b - y.b) + "i";
    }

    @Override
    public String mult(Number a, Number b) {
        return null;
    }

    @Override
    public String div(Number a, Number b) {
        return null;
    }
}

