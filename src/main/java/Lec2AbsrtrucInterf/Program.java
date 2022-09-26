package Lec2AbsrtrucInterf;

public class Program {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 123;
//        System.out.println(f1);
        f1.printCount();

//        Foo.count = 123000;

        Foo f2 = new Foo();
        f2.value = 222;
//        System.out.println(f2);
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 444;
//        System.out.println(f3);
        f3.printCount();
    }
}
