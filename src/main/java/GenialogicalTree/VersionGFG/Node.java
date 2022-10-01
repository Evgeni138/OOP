package GenialogicalTree.VersionGFG;
// Создание класса Node, содержащего информацию о дочернем и братском элементах
public class Node {
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
    public static Node addSibling(Node node, Person person) {
        if (node == null)
            return null;
        while (node.sibling != null)
            node = node.sibling;
        return (node.sibling = new Node(person));
    }
// Метод добавления длчернего элемента
    public static Node addChild(Node node, Person person) {
        if (node == null)
            return null;

        if (node.child != null)
            return (addSibling(node.child, person));
        else
            return (node.child = new Node(person));
    }

}
