package GenealogicalTree.VersionYou;

import java.util.Objects;

// Создание класса Person, который наследуется от People  и подключаем интерфей Comparable, позволяющий сравнивать элементы класса
public class Person extends People implements Comparable<Person> {

    private String sex;
    private Integer age;

    Person(String fullName, String sex, Integer age) { // В конструктор передаем элемент fullNane, наследованный из People и иннициализированный age

        this.setFullName(fullName);
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Переопредеоение метода toString
    @Override
    public String toString() {
        return getFullName();
    }

    // Переопредеоение метода equals для проверки, существует ли вносимый объект
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getFullName(), person.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName());
    }

    // Переопределяем интерфейс сравнения классов
    @Override
    public int compareTo(Person o) {
        return age.compareTo(o.age);
    }

}
