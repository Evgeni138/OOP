package Lesson5.Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new ConsoleView());
//        Presenter p1 = new Presenter(new MultModel(), new ConsoleView());

        System.out.println(p.view);

        p.buttonClick();
//        p.buttonClick();
//        p.buttonClick();
//        p.buttonClick();
//        p1.buttonClick();
    }
}
