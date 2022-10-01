package GenialogicalTree.VersionGFG;

import java.util.ArrayList;

public class GenTree {

    static ArrayList<Node> branch = new ArrayList<>();

    // Общий обход дерева
    public static void detourTree(Node root) {
        if (root == null)
            return;
        while (root != null) {
            System.out.println(root.person);
            if (root.child != null)
                detourTree(root.child);
            root = root.sibling;
        }
    }

    // Метод выводит дочерние элементы
    public static void searchChildrens(Node root) {
        StringBuilder sb = new StringBuilder();
        if (root == null)
            return;

        if (root.child != null) {
            sb.append(root.child.person.fullName);
            root = root.child;

            while (root.sibling != null) {
                sb.append("\n" + root.sibling.person.fullName);
                root = root.sibling;
            }
        }
        System.out.println(sb);
    }

    // Метод поиска внуков
    public static void searchGrandChindrens(Node root) {

        if (root == null) {
            return;
        }

        if (root.child != null) {
            searchChildrens(root.child);
            root = root.child;

            while (root.sibling != null) {
                searchChildrens(root.sibling);
                root = root.sibling;
            }

        }
    }
    // Метод совершает прямой обход по дереву и заполняет массив из всех элементов этого дерева,
    // что бы использовать эти элементы при переборе для поиска нужного элемента.
    public static ArrayList<Node> fillArrayTree(Node root) {
        if (root == null)
            return null;

        while (root != null) {
            branch.add(root);
            if (root.child != null) {
                fillArrayTree(root.child);
            }
            root = root.sibling;
        }
        return branch;
    }

// Метод определяет родительский элемент
    public static Node searchFarther(ArrayList<Node> branch, Person person) {
        Node father = null;
        int index = 0;

        for (int i = 0; i < branch.size(); i++) {
            if (branch.get(i).person.fullName == person.fullName) {
                index = i;
                break;
            }
        }
        for (int i = index - 1; i >= 0; i--) {
            if ((branch.get(i).sibling != null && branch.get(i).sibling.person == person)
                    || (branch.get(i).child != null && branch.get(i).child.person == person)) {

                if (branch.get(i).child != null && (branch.get(i).sibling == null ||
                        branch.get(i).sibling.person != person)) {

                    father = branch.get(i);
                    break;
                } else
                    person = branch.get(i).person;
            }
        }
        return father;
    }

// Метод поиска и вывода дедушки
    public static void searchGrandfather(ArrayList<Node> branch, Person person) {
        try {
            Person farther = searchFarther(branch, person).person;
            Node grandfarther = searchFarther(branch, farther);
            System.out.println("grandfather: " + grandfarther.person.fullName);
        }
        catch (NullPointerException e) {
            System.out.println("grandfather: " + null);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("Root_10");
        Person p2 = new Person("Root.Child_2");
        Person p3 = new Person("Root.Child_3");
        Person p4 = new Person("Root.Child_4");
        Person p5 = new Person("Root.Child_5");
        Person p6 = new Person("Root.Child_4.Child_6");
        Person p7 = new Person("Root.Child_5.Child_7");
        Person p8 = new Person("Root.Child_5.Child_8");
        Person p9 = new Person("Root.Child_5.Child_9");
        Person p10 = new Person("Root.Child_3.Child_10");
        Person p11 = new Person("Root.Child_2.Child_11");
        Person p12 = new Person("Root.Child_2.Child_12");

        Node root = new Node(p1);
        Node n1 = Node.addChild(root, p2);
        Node n2 = Node.addChild(root, p3);
        Node n3 = Node.addChild(root, p4);
        Node n4 = Node.addChild(n3, p6);
        Node n5 = Node.addChild(root, p5);
        Node n6 = Node.addChild(n5, p7);
        Node n7 = Node.addChild(n5, p8);
        Node n8 = Node.addChild(n5, p9);
        Node n9 = Node.addChild(n2, p10);
        Node n10 = Node.addChild(n1, p11);
        Node n11 = Node.addChild(n1, p12);

        branch = fillArrayTree(root);

        System.out.println("childrens:");
        searchChildrens(root);
        System.out.println();

        System.out.println("grandchildrens:");
        searchGrandChindrens(root);
        System.out.println();

        System.out.println("farter: " + searchFarther(branch, p3).person.fullName);
        System.out.println();
        searchGrandfather(branch, p9);
    }
}
