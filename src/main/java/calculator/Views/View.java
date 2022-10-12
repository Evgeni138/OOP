package calculator.Views;
// Описывается интерфейс View
import java.util.ArrayList;

public interface View {
    String getAction();

    ArrayList<Double> setNumber(String s);

    String chooseType();
}
