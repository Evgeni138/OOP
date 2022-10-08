package LecOOP;

public class Point2DMethod {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
//        a.x = 0;
//        a.y = 2;
        System.out.println(a);

        Point2D b = new Point2D();
//        b.x = 0;
//        b.y = 2;
        System.out.println(b);
        b.setY(6);
        System.out.println("new b: " + b);
//        System.out.println(distance(a, b));
//        Point2D.d
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
