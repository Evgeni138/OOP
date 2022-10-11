package calculator.Views;

import java.util.ArrayList;

public interface View {
    String getNumber();

    ArrayList<Double> setNumber(String s);

    String chooseType();
}
