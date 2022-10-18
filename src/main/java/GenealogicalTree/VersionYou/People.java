package GenealogicalTree.VersionYou;
// Родительский класс абстракция
// Добавлен пол
abstract public class People {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
