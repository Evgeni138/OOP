package GenialogicalTree;

import java.util.ArrayList;


public class GenTreeExample {

    public static void main(String[] args) {
        Person irina = new Person("Irina");
        Person vasya = new Person("Vasilyi");
        Person masha = new Person("Masha");
        Person jane = new Person("Jane");
        Person ivan = new Person("Ivan");
        Person petya = new Person("Petr");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(petya, vasya);
        gt.append(irina, masha);
        gt.append(petya, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Research(gt).spend(vasya, Relationship.children));
        System.out.println(new Reserch2(gt).spend2(masha, Relationship.children, 2));
    }
}

enum Relationship {
    parent, children
}

class Person {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return String.format("(%s)", this.fullName);
    }
}

class Node {
    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}

class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}

class Research {
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Person> spend(Person p, Relationship re) {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2);
            }
        }
        return result;
    }
}


class Reserch2 {
    ArrayList<Node> tree;

    public Reserch2(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Person> spend2 (Person p, Relationship re, int generation) {
        ArrayList<Person> result = new ArrayList<>();
//        if (generation == 0) {
//            result.add(p);
//        }


//        int index = 0;
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                System.out.println(1);
                for (Node t2 : tree) {
                    if (t2.p2.getFullName() == t.p1.getFullName()) {
                        result.add(t2.p1);
                    }
                }
            }
        }
        return result;
    }

    // ...
}

class Reserch3 {
    // ...
}

class Printer {
    // ...
}