import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// Описывается класс Classes
public class Classes {

    // Описывается метод заполнения таблицы classes в базе данных
    public static void insertDataClass(Connection c, String nameClass, int weekID, int lessonID) throws SQLException {
        PreparedStatement psInsertTableClass = c.prepareStatement(
                "INSERT INTO classes (nameClass, weekID, lessonID)" +
                        "VALUES (?, ?, ?)");
        psInsertTableClass.setString(1, nameClass);
        psInsertTableClass.setInt(2, weekID);
        psInsertTableClass.setInt(3, lessonID);
        psInsertTableClass.execute();
    }

    // Описывается метод удаления строки из таблицы
    public static void deleteElementClass(Connection c, int classID) throws SQLException {
        PreparedStatement prDeleteElementClass = c.prepareStatement(
                "DELETE FROM classes WHERE classID = ?;"
        );
        prDeleteElementClass.setInt(1, classID);
        prDeleteElementClass.execute();

    }
    // Описывается метод вывода данных таблицы
    public static void selectTableClass(Connection c) throws SQLException {
        PreparedStatement psSelectTableLesson = c.prepareStatement("SELECT * FROM classes");
        ResultSet rsS = psSelectTableLesson.executeQuery();

        while (rsS.next()) {
            System.out.println(rsS.getString("classID"));
        }
    }
}
