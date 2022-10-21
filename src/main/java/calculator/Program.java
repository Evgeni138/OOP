package calculator;

import calculator.Models.CalculationNumber;
import calculator.Presenters.Presenter;
import calculator.Views.ComplexView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
    static Logger logger = LoggerFactory.getLogger(Program.class);
    public static void main(String[] args) {

        Presenter presener = new Presenter(new CalculationNumber(), new ComplexView());
        System.out.println(presener.calculatorPresenter());
        System.out.println(presener.sb);

        logger.info(String.valueOf(presener.sb));

        try (FileWriter writer = new FileWriter("src/main/java/calculator/dataCalc.txt", true)) {
            writer.append("\n" + presener.sb);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
