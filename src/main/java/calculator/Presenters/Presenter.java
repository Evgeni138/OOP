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

    public String sumPres() {
        ArrayList<Double> x = complexView.setNumber();
        ArrayList<Double> y = complexView.setNumber();
        String key = complexView.getNumber();
while (true) {
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

//    RacNumber racX = new RacNumber(1, 1);
//    RacNumber racY = new RacNumber(1, 4);
//
//    calculationNumber.sum(racX, racY);
}
