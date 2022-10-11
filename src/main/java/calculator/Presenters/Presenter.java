package calculator.Presenters;

import calculator.Models.CalculationNumber;
import calculator.Models.ComplexNumber;
import calculator.Views.ComplexView;

import java.util.ArrayList;

public class Presenter {
    CalculationNumber calculationNumber;
    ComplexView complexView;

    public Presenter(CalculationNumber cal, ComplexView comp) {
        calculationNumber = cal;
        complexView = comp;
    }

    public String calculatorPresenter() {
        String key1 = complexView.chooseType();

        ArrayList<Double> x = complexView.setNumber(key1);
        ArrayList<Double> y = complexView.setNumber(key1);
        String key = complexView.getNumber();
        switch (key) {
            case "+":
                return calculationNumber.sum(new ComplexNumber(x.get(0), x.get(1)), new ComplexNumber(y.get(0), y.get(1)));
            case "-":
                return calculationNumber.sub(new ComplexNumber(x.get(0), x.get(1)), new ComplexNumber(y.get(0), y.get(1)));
            default:
                return null;
        }
    }
}
