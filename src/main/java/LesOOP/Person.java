package LesOOP;

import java.util.Date;


public class Person {
    private String name;
    private String sex;
    private String dateBirth;
    private String dateDeath;
    private int iD;
    static int allID = 0;
    public Person(String name, String sex, String dateBirth, String dateDeath) {
        this.name = name;
        this.sex = sex;
        this.dateBirth = dateBirth;
        this.dateDeath = dateDeath;
        this.iD = allID++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", dateDeath='" + dateDeath + '\'' +
                '}';
    }

    int push(int item) {
        int[] storage = new int[100];
        int count = 0;
        storage[count++] = item;
        return item;
    }
//    static {
//        BaseHero.number = 0;
//        BaseHero.r = new Random();
//    }

}







