package GenialogicalTree.VersionGFG;

import java.util.Objects;

// Создание класса Person
public class Person {
    String fullName;
    Person(String fullName){
        this.fullName = fullName;
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
}
