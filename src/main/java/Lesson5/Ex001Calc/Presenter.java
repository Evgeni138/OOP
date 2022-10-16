package Lesson5.Ex001Calc;

public class Presenter {
    View view;
    Model model; //???????

    public Presenter(Model m, View v) {//??
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getX();
        int b = view.getY();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print("Sum: ", result);
    }
}
