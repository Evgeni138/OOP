package hW5Area;
// Описывается класс Circle, который наследуется от класса Figura и подключается интерфейс Area
public class Circle extends Figure implements Area{

    private double radius;

    public Circle(String form, double radius) {
        super(form);
        this.radius = radius;
    }
// Переопределяется метод calculation наследуемый из подключенного интерфейса Area
    @Override
    public double calculation() {
        return radius * radius * Math.PI;
    }
}
