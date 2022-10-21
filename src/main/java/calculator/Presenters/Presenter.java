package calculator.Presenters;

import calculator.Models.CalculationNumber;
import calculator.Models.ComplexNumber;
import calculator.Views.ComplexView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

// Описывается класс Presenter

public class Presenter {
    static Logger logger = LoggerFactory.getLogger(Presenter.class);

    // Задаются поля для создания конструктора класса Presenter с экземплярами обладающими
    // методами CalculationNumber и ComplexView
    CalculationNumber calculationNumber;
    ComplexView complexView;
    public static StringBuilder sb = new StringBuilder();
    public Presenter(CalculationNumber cal, ComplexView comp) {
        calculationNumber = cal;
        complexView = comp;
    }
    // Описывается метод calculatorPresenter в котором протсходит выбор типа чисел, счмтывание чисел через View,
    // выбор операции и вычисление

    public String calculatorPresenter() {
        String key1 = complexView.chooseType();
        System.out.println(key1);
        if (key1.equals("1")) {
            sb.append("ComplexNumbers: ");
            logger.info("ComplexNumbers: ");
        }
        else {
            sb.append("RationalNumbers: ");
            logger.info("RationalNumbers: ");
        }
        ArrayList<Double> x = complexView.setNumber(key1);
        ArrayList<Double> y = complexView.setNumber(key1);

        sb.append(x);
        logger.info(String.valueOf(x));
        sb.append(y);
        logger.info(String.valueOf(y));
        String result;
        String key = complexView.getAction();
        switch (key) {
            case "+":
                result = calculationNumber.sum(new ComplexNumber(x.get(0), x.get(1)), new ComplexNumber(y.get(0), y.get(1)));
                sb.append(key);
                sb.append(result);
                logger.info(key);
                logger.info(result);
                return result;
            case "-":
                result = calculationNumber.sub(new ComplexNumber(x.get(0), x.get(1)), new ComplexNumber(y.get(0), y.get(1)));
                sb.append(key);
                sb.append(result);
                logger.info(key);
                logger.info(result);
                return result;
            case "*":
                result = calculationNumber.mult(new ComplexNumber(x.get(0), x.get(1)), new ComplexNumber(y.get(0), y.get(1)));
                sb.append(key);
                sb.append(result);
                logger.info(key);
                logger.info(result);
                return result;
            case "/":
                result = calculationNumber.div(new ComplexNumber(x.get(0), x.get(1)), new ComplexNumber(y.get(0), y.get(1)));
                sb.append(key);
                sb.append(result);
                logger.info(key);
                logger.info(result);
                return result;
            default:
                return null;
        }
    }
}
