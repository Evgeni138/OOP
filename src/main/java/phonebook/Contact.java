package phonebook;
// Описывается класс Contact

public class Contact implements Comparable<Contact>{
    int iD;
    String firstName;
    String lastName;
    String number;
    String description;
    // Описывается пустой конструктор для серилизации десирилизации при записи JSON
    public Contact(){}
    // Описывается пустой конструктор
    Contact(int iD, String firstName, String lastName, String number, String description) {
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.description = description;
    }
    // Создаются сетеры и гетеры для серилизации десирилизации
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Перезаписывается метод сравнения
    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact) obj;
        return this.firstName == t.firstName
                && this.lastName == t.lastName
                && this.number == t.number;
    }

    @Override
    public int compareTo(Contact o) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n Contact{" +
                "iD=" + iD +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
