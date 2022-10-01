package GenealogicalTree.VersionYou;

import java.util.ArrayList;
import java.util.List;

public class GenTree {

    static ArrayList<Node> branch = new ArrayList<>();
    static List<Person> arrayChildrens = new ArrayList<>();
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
        if (root == null)
            return;

        if (root.child != null) {
            arrayChildrens.add(root.child.person);
            root = root.child;

            while (root.sibling != null) {
                arrayChildrens.add(root.sibling.person);
                root = root.sibling;
            }
        }
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
            System.out.println("grandfather " + grandfarther.person.fullName);

        } catch (NullPointerException e) {
            System.out.println("grandfather " + null);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Root_10", 70);
        Person p2 = new Person("Root.Child_2", 40);
        Person p3 = new Person("Root.Child_3", 49);
        Person p4 = new Person("Root.Child_4", 44);
        Person p5 = new Person("Root.Child_5", 47);
        Person p6 = new Person("Root.Child_4.Child_6", 20);
        Person p7 = new Person("Root.Child_5.Child_7", 18);
        Person p8 = new Person("Root.Child_5.Child_8", 20);
        Person p9 = new Person("Root.Child_5.Child_9", 17);
        Person p10 = new Person("Root.Child_3.Child_10",18);
        Person p11 = new Person("Root.Child_2.Child_11",19);
        Person p12 = new Person("Root.Child_2.Child_12", 21);

        Node root = new Node(p1);
        Node n1 = root.addChildren(p2);
        Node n2 = root.addChildren(p3);
        Node n3 = root.addChildren(p4);
        Node n4 = n3.addChildren(p6);
        Node n5 = root.addChildren(p5);
        Node n6 = n5.addChildren(p7);
        Node n7 = n5.addChildren(p8);
        Node n8 = n5.addChildren(p9);
        Node n9 = n2.addChildren(p10);
        Node n10 = n1.addChildren(p11);
        Node n11 = n1.addChildren(p12);

//        detourTree(root);
//        System.out.println();
        searchChildrens(root);
        arrayChildrens.sort(Person::compareTo); // Сортировка элементов по возросту используя интерфейс comparable
        for (Person p: arrayChildrens) {
            System.out.println(p.fullName +" "+ p.age);
        }

        arrayChildrens.clear();
        System.out.println();
        searchGrandChindrens(root);
        arrayChildrens.sort(Person::compareTo); // Сортировка элементов по возросту используя интерфейс comparable
        for (Person p: arrayChildrens) {
            System.out.println(p.fullName + " " + p.age);
        }

        System.out.println();

//        detourTree(root);
        branch = fillArrayTree(root);

        System.out.print("father ");
        System.out.println(searchFarther(branch, p3).person.fullName);
        System.out.println();
        searchGrandfather(branch, p9);
    }
}
