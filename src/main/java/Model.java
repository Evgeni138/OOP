import java.sql.*;
import java.util.Scanner;

public class Model {
    public Model() {
    }

    Scanner iScanner = new Scanner(System.in);

    // Описывается метод для установления поделючения к базе данных
    public Connection setConnection() {
        Connection connectoin = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connectoin = DriverManager.getConnection("jdbc:sqlite:schedule.db");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connectoin;
    }

    // Описывается метод для вывода всешо расписания по классам
    public void requestClassDayLesson() throws SQLException {
        System.out.println();
        Connection connectoin = setConnection();
        PreparedStatement psJoin = connectoin.prepareStatement(
                "SELECT classes.nameClass, days.nameDay, lessons.nameLesson FROM (classes " +
                        "INNER JOIN days ON classes.weekID = days.dayID) " +
                        "INNER JOIN lessons ON classes.lessonID = lessons.lessonID");
        ResultSet rsS = psJoin.executeQuery();

        while (rsS.next()) {
            System.out.print(rsS.getString("nameClass") + " ");
            System.out.print(rsS.getString("nameDay") + " ");
            System.out.print(rsS.getString("nameLesson") + "\n");
        }
        System.out.println();
    }

    // Описывается метод для вывода расписания по дням недели
    public void requestDayClassLesson() throws SQLException {
        System.out.println();
        Connection connectoin = setConnection();
        PreparedStatement psJoin = connectoin.prepareStatement(
                "SELECT days.nameDay, classes.nameClass, lessons.nameLesson FROM (days " +
                        "INNER JOIN classes ON classes.weekID = days.dayID) " +
                        "INNER JOIN lessons ON classes.lessonID = lessons.lessonID");
        ResultSet rsS = psJoin.executeQuery();

        while (rsS.next()) {
            System.out.print(rsS.getString("nameDay") + " ");
            System.out.print(rsS.getString("nameClass") + " ");
            System.out.print(rsS.getString("nameLesson") + "\n");
        }
        System.out.println();
    }

    // Описывается метод вывода расписания для конкретного класса в конкретный день
    public void requstLessonClassDay() throws SQLException {
        View view = new View();
        String classID = view.chooseClass();
        String dayID = view.chooseDay();
        System.out.println();
        Connection connectoin = setConnection();
        PreparedStatement psJoin = connectoin.prepareStatement(
                "SELECT lessons.nameLesson FROM (classes " +
                        "INNER JOIN days ON classes.weekID = days.dayID ) " +
                        "INNER JOIN lessons ON classes.lessonID = lessons.lessonID " +
                        "WHERE nameDay = ? AND nameClass = ? ");

        psJoin.setString(1, dayID);
        psJoin.setString(2, classID);

        ResultSet rsS = psJoin.executeQuery();

        while (rsS.next()) {
            System.out.print(rsS.getString("nameLesson") + "\n");
        }
        System.out.println();
    }

}
