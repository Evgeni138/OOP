package hW5Area;

// Описывается класс Square наследуемый от класса Rectangle
public class Square extends Rectangle {
    private double side;

    public Square(String form, double side) {
        super(form);
        this.side = side;
    }

    // Переопределяется метод calculation наследуемый из подключенного интерфейса Area
    @Override
    public double calculation() {
        return side * side;
    }
}
