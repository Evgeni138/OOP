import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lessons {
    // Описывается метод заполнения таблицы days в базе данных
    public static void insertDataLesson(Connection connection, String nameLesson) throws SQLException {
        PreparedStatement psInsertTableLesson = connection.prepareStatement(
                "INSERT INTO lessons (nameLesson)" +
                        "VALUES (?)");
        psInsertTableLesson.setString(1, nameLesson);
        psInsertTableLesson.execute();
    }

    // Описывается метод вывода данных таблицы
    public static void selectTableLesson(Connection c) throws SQLException {
        PreparedStatement psSelectTableLesson = c.prepareStatement("SELECT * FROM lessons");
        ResultSet rsS = psSelectTableLesson.executeQuery();

        while (rsS.next()) {
            System.out.println(rsS.getString("nameLesson"));
        }
    }
}
