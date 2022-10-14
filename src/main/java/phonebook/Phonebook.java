package phonebook;

import java.util.ArrayList;
import java.util.List;
// Описывается класс Phonebook для работы с контактами

public class Phonebook {
    List<Contact> contacts;

    // Описывется конструктор Phonebook
    public Phonebook() {
        contacts = new ArrayList<>();
    }
    // Описываются сетеры и гетеры
    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Описывется метод добаввления контакта
    public void addContact(Contact contact) {

        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    // Описывется метод перебора контактов
    public List<Contact> viewContacts() {
        if (contacts != null)
            return contacts;
        else return null;
    }

    // Описывется метод вовращающий index контакта по его ID

    public int decisionIndexContact(int iD) {
        int index = 0;
        for (Contact contact: contacts) {
            if (contact.iD == iD) return index;
            index++;
        }
        return -1;
    }
    // Описывется метод удаляющий контакт

    public void deleteContact(int iD) {
        int index = decisionIndexContact(iD);
        if (index < 0) System.out.println("Not found index");
        else contacts.remove(decisionIndexContact(iD));
    }

}
