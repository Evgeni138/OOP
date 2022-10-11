package calculator.Views;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexView implements View {
    Scanner iScaner = new Scanner(System.in);

    @Override
    public String chooseType() {
        System.out.println("Input Type: 1 - Complex numbers (a+b*i), 2 - Rational numbers (a/b)");
        return iScaner.next();
    }

    @Override
    public String getNumber() {
        System.out.println("Input action (+, -, *, /)");
        return iScaner.next();
    }

    @Override
    public ArrayList<Double> setNumber(String key) {
        ArrayList<Double> listNumber = new ArrayList<>();
        switch (key) {
            case "1":
                System.out.print("Input a: ");
                double numberA = iScaner.nextDouble();
                System.out.print("Input b: ");
                double numberB = iScaner.nextDouble();
                listNumber.add(numberA);
                listNumber.add(numberB);
                return listNumber;
            case "2":
                System.out.print("Input a: ");
                double numberA1 = iScaner.nextDouble();
                System.out.print("Input b: ");
                double numberB1 = iScaner.nextDouble();
                listNumber.add(numberA1 / numberB1);
                listNumber.add(0.0);
                return listNumber;
            default: return null;
        }
    }


}
