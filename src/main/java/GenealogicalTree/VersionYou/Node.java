package GenealogicalTree.VersionYou;

// Создание класса Node, содержащего информацию о дочернем и братском элементах
public class Node implements AddSibling, AddChildren {
    Person person;
    Node child;
    Node sibling;

    // конструктор Node
    public Node(Person person) {
        this.person = person;
        child = null;
        sibling = null;
    }
// Метод добавления братского эдемента

    @Override
    public Node addChildren(Person person) {
        Node node = this;
        if (node == null)
            return null;

        if (node.child != null)
            return (node.child.addSibling(person));
        else
            return (node.child = new Node(person));
    }

    @Override
    public Node addSibling(Person person) {
        Node node = this;
        if (node == null)
            return null;
        while (node.sibling != null)
            node = node.sibling;
        return (node.sibling = new Node(person));
    }
}
