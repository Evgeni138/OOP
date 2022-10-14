package phonebook;

import java.util.Scanner;
// Описывается класс Presenter
public class Presenter {
    Phonebook phonebook;
    View view;
    // Описывается конструктор Presenter
    Presenter(Phonebook phonebook, View view) {
        this.phonebook = phonebook;
        this.view = view;
    }

    // Описывается метод запуска приложения
    void run() {
        SaveLoad saveLoad = new SaveLoad(); // Создается объект SaveLoad, чтобы вызывать его методы
        Scanner iScanner = new Scanner(System.in);
        phonebook = saveLoad.load(); // Загружается из файла записная книжка
        if (phonebook == null) phonebook = new Phonebook(); // Если записная книжка пустая, заводится новая
        boolean flag = true;
        // Пречисляются для выбора процедуры работы приложения
        while (true) {
            System.out.println();
            System.out.println("Input 1 - add contact, 2 - print phonebook, 3 - delete contact," +
                    "4 - uodate contact, 0 - quit");
            String key = iScanner.next();
            switch (key) {
                case "1":
                    phonebook.addContact(view.setContact());
                    System.out.println(phonebook);
                    break;
                case "2":
                    System.out.println(phonebook.viewContacts());
                    break;
                case "3":
                    phonebook.deleteContact(view.setID());
                    break;
                case "4":
                    phonebook.deleteContact(view.setID());
                    System.out.println("Input new data");
                    phonebook.addContact(view.setContact());
                    break;
                case "0":
                    saveLoad.save(phonebook);
                    return;
            }
        }
    }
}
