import org.sqlite.SQLiteException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateDB {


    public static void createTableClass(Connection c) {
        Connection connectoin = c;
        try {
            PreparedStatement psCreateTableClass = connectoin.prepareStatement("CREATE TABLE classes (" +
                    "classID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    "nameClass TEXT NOT NULL," +
                    "weekID INTEGER," +
                    "lessonID INTEGER" +
                    ");");
            psCreateTableClass.execute();
        } catch (
                SQLiteException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createTableDay(Connection c) {
        Connection connectoin = c;
        try {
        PreparedStatement psCreateTableDay = connectoin.prepareStatement("CREATE TABLE days (" +
                "dayID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "nameDay TEXT NOT NULL" +
                ");");
        psCreateTableDay.execute();
    } catch (SQLiteException e) {
        System.out.println(e.getMessage());
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createTableLesson(Connection c) {
        Connection connectoin = c;
        try {
            PreparedStatement psCreateTableLesson = connectoin.prepareStatement("CREATE TABLE lessons (" +
                    "lessonID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    "nameLesson TEXT NOT NULL" +
                    ");");
            psCreateTableLesson.execute();
        } catch (SQLiteException e) {
            System.out.println(e.getMessage());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
