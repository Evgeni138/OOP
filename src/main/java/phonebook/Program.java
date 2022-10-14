package phonebook;

public class Program {
    public static void main(String[] args) {
// Создается объект класса Presenter для использлвания его метода для запуска приложения
        Presenter presenter = new Presenter(new Phonebook(), new View());
// Запуск приложения
        presenter.run();

    }
}
