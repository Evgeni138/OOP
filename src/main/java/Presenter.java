import java.sql.SQLException;
// Описывается класс Presenter

public class Presenter {
    // Задаются объекты классов Model и View для использования их методов
    Model model;
    View view;

    // Описывается конструктор Presenter
    Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Описывается метод, в котором выбирается необходимая задача
    public void appSchedule() throws SQLException {
        boolean flag = true;
        while (flag) {
            int key = view.choseRequest();
            switch (key) {
                case 1:
                    model.requestClassDayLesson();
                    break;
                case 2:
                    model.requestDayClassLesson();
                    break;
                case 3:
                    model.requstLessonClassDay();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
