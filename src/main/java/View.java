import java.util.Scanner;
// Описывается класс View
public class View {
    Scanner iScanner = new Scanner(System.in);

    // Описывается метод выбора запроса
    public int choseRequest() {
        System.out.println("Input to choose request: 1 - all schedule (class-day-lesson), \n" +
                "2 - all schedule (day-class-lesson), \n" +
                "3 - lessons (class-day), \n" +
                "0 - exit");
        return iScanner.nextInt();
    }

    // Описывается метод выбора класса
    public String chooseClass() {
        System.out.println("Input to choose class: 1 - '1A' , 2 - '1B'");
        int key = iScanner.nextInt();
        switch (key) {
            case 1:
                return "1A";
            case 2:
                return "1B";
            default:
                return "Exeption: incorrect input";
        }
    }

    // Описывается метод выбора дня недели

    public String chooseDay() {
        System.out.println("Input to choose day: 1 - monday, \n" +
                "2 - tuesday, \n" +
                "3 - wednesday, \n " +
                "4 - thursday, \n" +
                "5 - friday");
        int key = iScanner.nextInt();
        switch (key) {
            case 1:
                return "monday";
            case 2:
                return "tuesday";
            case 3:
                return "wednesday";
            case 4:
                return "thursday";
            case 5:
                return "friday";
            default:
                return "Exeption: incorrect input";
        }
    }
}
