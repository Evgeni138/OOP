package Lesson3;

public class Area {
    double length;
    double width;
    double radius;

    void area() {
        double area;
        area = this.length * this.width;
        System.out.println("Area = " + area);
    }

    void circle() {
        double areaCircle;
        double pi = 3.14;
        areaCircle = pi * this.radius * this.radius;
        System.out.println("AreaCircle = " + areaCircle);
    }
}

class Use_Area {
    public static void main(String[] args) {
        Area rect = new Area();
        rect.length = 15.84;
        rect.width = 22.65;
        System.out.println("length = " + rect.length);
        System.out.println("width = " + rect.width);
        rect.area();

        System.out.println();

        Area rectCircle = new Area();
        rectCircle.radius = 10.1;
        System.out.println("radius = " + rectCircle.radius);
        rectCircle.circle();
    }
}

