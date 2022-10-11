package calculator.Views;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexView implements View{
    Scanner iScaner = new Scanner(System.in);

    @Override
    public String getNumber() {
        System.out.println("Input action (+, -, *, /)");
        return iScaner.next();
    }

    @Override
    public ArrayList<Double> setNumber() {
        ArrayList<Double> listNumber = new ArrayList<>();
        System.out.print("Input a: ");
        double numberA = iScaner.nextDouble();
        System.out.print("Input b: ");
        double numberB = iScaner.nextDouble();
        listNumber.add(numberA);
        listNumber.add(numberB);
        return listNumber;
    }

    @Override
    public double result() {
        return 0;
    }
}
