package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LiskovSubstitution {

    public static void main(String[] args) throws Exception {
        List<Animal> list = new ArrayList<>(Arrays.asList(new Cat(), new Fish()));
//        List<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Fish());
//        for (Animal animal: list) {
//            System.out.println(animal.getType());
//            System.out.println(animal.getLegsCount());
//        }

        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));
        for (var animal: list1) {
            System.out.println(animal.getType1());
        }

        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog()));
        for (var animal: list2) {
            System.out.println(animal.getLegsCount1());
        }
    }
}

abstract class Animal {
    public String getType() {
        return "animal";
    }

    public int getLegsCount() throws Exception {
        return 0;
    }
}

class Cat extends Animal {
    @Override
    public String getType() {
        return "pussicat";
    }

    @Override
    public int getLegsCount() throws Exception {
        return 4;
    }
}

class Fish extends Animal {
    @Override
    public String getType() {
        return "fish";
    }

    public int getLegsCount() throws Exception {
        throw new Exception("I`m a fish");
    }
}

abstract class AbstractAnimal {
    public String getType1() {
        return "Animals";
    }
}

interface Legs {
    int getLegsCount1();
}

class Dog extends AbstractAnimal implements Legs {
    @Override
    public String getType1() {
        return "dogy";
    }

    @Override
    public int getLegsCount1() {
        return 4;
    }
}

class Python extends AbstractAnimal {
    @Override
    public String getType1() {
        return "python";
    }
}