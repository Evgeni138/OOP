package hW5Area;
// Описывается класс Rectangle наследуемый от класса Figura и пожключается интерфейс Area
class Rectangle extends Figure implements Area {
    private double width;
    private double heigth;

    // Описывается два конструктора, в оном конструкторе
    Rectangle(String form, double width, double heigth) {
        super(form);
        this.heigth = heigth;
        this.width = width;
    }

    Rectangle(String form) {
        super(form);
    }

    // Переопределяется метод calculation наследуемый из подключенного интерфейса Area
    @Override
    public double calculation() {
        return heigth * width;
    }


}
