import java.sql.Connection;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException {

// Эти команды используются для заполгнгтя таблиц в нашей базе данных
//        Connection connectoin = presenter.model.setConnection();
//        CreateDB.createTableClass(connectoin);
//        CreateDB.createTableDay(connectoin);
//        CreateDB.createTableLesson(connectoin);
//
//        Classes.insertDataClass(connectoin, "1B", 5, 1);
//        Classes.deleteElementClass(connectoin, 44);
//        Classes.selectTableClass(connectoin);
//
//        Days.selectTableLesson(connectoin);
//        Lessons.selectTableLesson(connectoin);

        // Создается объект класса Presenter
        Presenter presenter = new Presenter(new Model(), new View());
        // Запускается приложение через метод appSchedule() класс Presenter
        presenter.appSchedule();
    }
}
