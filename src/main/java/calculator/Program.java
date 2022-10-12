package calculator;

import calculator.Models.CalculationNumber;
import calculator.Presenters.Presenter;
import calculator.Views.ComplexView;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        Presenter presener = new Presenter(new CalculationNumber(), new ComplexView());
        System.out.println(presener.calculatorPresenter());
        System.out.println(presener.sb);

        try (FileWriter writer = new FileWriter("src/main/java/calculator/dataCalc.db", true)) {
            writer.append("\n" + presener.sb);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
