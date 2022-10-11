package calculator;

import calculator.Models.CalculationNumber;
import calculator.Presenters.Presenter;
import calculator.Views.ComplexView;

public class Program {
    public static void main(String[] args) {

        Presenter presener = new Presenter(new CalculationNumber(), new ComplexView());
        System.out.println(presener.calculatorPresenter());

    }
}
