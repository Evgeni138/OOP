package calculator.Models;
// Описывается класс CalculationNumber к которому подключается интерфейс Calculation
public class CalculationNumber implements Calculation {
    // Описываются методы вычислений
    @Override
    public String sum(Number x, Number y) {
        if (x.b == 0 || y.b == 0)
            return String.valueOf(x.a + y.a);
        else return String.valueOf(x.a + y.a) + "+" + String.valueOf(x.b + y.b) + "*i";
    }

    @Override
    public String sub(Number x, Number y) {
        if (x.b == 0 || y.b == 0)
            return String.valueOf(x.a - y.a);
        else return String.valueOf(x.a - y.a) + "+" + String.valueOf(x.b - y.b) + "*i";
    }

    //(x.a*x.b - y.a* y.b) + (x.a *y.b+x.b *y.a)i.
    @Override
    public String mult(Number x, Number y) {
        if (x.b == 0 || y.b == 0)
            return String.valueOf(x.a * y.a);
        else return String.valueOf(x.a * y.a - x.b * y.b) + "+" + String.valueOf(x.a * y.b + x.b * y.a) + "*i";
    }

    @Override
    public String div(Number x, Number y) {
        if (x.b == 0 || y.b == 0)
            return String.valueOf(x.a / y.a);
        else return String.valueOf((x.a * y.a + x.b * y.b) / (y.a * y.a + y.b * y.b))
                + "+" + String.valueOf((x.b * y.a - x.a * y.b) / (y.a * y.a + y.b * y.b)) + "*i";
    }
}

