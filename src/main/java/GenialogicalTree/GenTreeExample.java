package GenialogicalTree;

import java.util.ArrayList;


public class GenTreeExample {

    public static void main(String[] args) {
        GenialogicalTree.VersionGFG.Person irina = new GenialogicalTree.VersionGFG.Person("Irina");
        GenialogicalTree.VersionGFG.Person vasya = new GenialogicalTree.VersionGFG.Person("Vasilyi");
        GenialogicalTree.VersionGFG.Person masha = new GenialogicalTree.VersionGFG.Person("Masha");
        GenialogicalTree.VersionGFG.Person jane = new GenialogicalTree.VersionGFG.Person("Jane");
        GenialogicalTree.VersionGFG.Person ivan = new GenialogicalTree.VersionGFG.Person("Ivan");
        GenialogicalTree.VersionGFG.Person petya = new GenialogicalTree.VersionGFG.Person("Petr");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(petya, vasya);
        gt.append(irina, masha);
        gt.append(petya, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Research(gt).spend(vasya, Relationship.children));
        System.out.println(new Reserch2(gt).spend2(petya, Relationship.parent, 2));
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
    public Node(GenialogicalTree.VersionGFG.Person p1, Relationship re, GenialogicalTree.VersionGFG.Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    GenialogicalTree.VersionGFG.Person p1;
    Relationship re;
    GenialogicalTree.VersionGFG.Person p2;

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

    public void append(GenialogicalTree.VersionGFG.Person parent, GenialogicalTree.VersionGFG.Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}

class Research {
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<GenialogicalTree.VersionGFG.Person> spend(GenialogicalTree.VersionGFG.Person p, Relationship re) {
        ArrayList<GenialogicalTree.VersionGFG.Person> result = new ArrayList<>();
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

    public ArrayList<GenialogicalTree.VersionGFG.Person> spend2 (GenialogicalTree.VersionGFG.Person p, Relationship re, int generation) {
        ArrayList<GenialogicalTree.VersionGFG.Person> result = new ArrayList<>();
        if (generation == 0) {
            result.add(p);
        }


//        int index = 0;
//        for (Node t : tree) {
//            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
//                for (Node t2 : tree) {
//                    if (t2.p1.getFullName() == t.p1.getFullName()) {
//                        result2.add(t2.p1);
//                    }
//                }
//            }
//        }
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