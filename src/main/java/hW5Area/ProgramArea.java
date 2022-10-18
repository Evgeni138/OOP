package hW5Area;

// Вычисление плошади фигур

public class ProgramArea {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle("Rectangle", 20, 5);
        System.out.println("Rectangle area = " + rectangle.calculation());
        System.out.println();

        Figure square = new Square("Square", 10);
        System.out.println("Square area = " + square.calculation());
        System.out.println();

        Figure circle = new Circle("Circle", 10);
        System.out.println("Circle area = " + circle.calculation());

    }

}
