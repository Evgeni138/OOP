package GenealogicalTree.VersionYou;

import java.util.Objects;

// Создание класса Person, который наследуется от People  и подключаем интерфей Comparable, позволяющий сравнивать элементы класса
public class Person extends People implements Comparable<Person> {

    Integer age;
    Person(String fullName, Integer age) { // В конструктор передаем элемент fullNane, наследованный из People и иннициализированный age

        this.fullName = fullName;
        this.age = age;
    }

    // Переопредеоение метода toString
    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
// Переопределяем интерфейс сравнения классов
    @Override
    public int compareTo(Person o) {
        return age.compareTo(o.age);
    }

}
