import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Days {
    // Описывается метод заполнения таблицы days в базе данных
    public static void insertDataClass(Connection c, String nameDay) throws SQLException {
    PreparedStatement psInsertTableDay = c.prepareStatement(
                "INSERT INTO days (nameDay)" +
                        "VALUES (?)");
        psInsertTableDay.setString(1, nameDay);
        psInsertTableDay.execute();
    }

    // Описывается метод вывода данных таблицы
    public static void selectTableLesson(Connection c) throws SQLException {
        PreparedStatement psSelectTableDay = c.prepareStatement("SELECT * FROM days");
        ResultSet rsS = psSelectTableDay.executeQuery();

        while (rsS.next()) {
            System.out.println(rsS.getString("nameDay"));
        }
    }
}
