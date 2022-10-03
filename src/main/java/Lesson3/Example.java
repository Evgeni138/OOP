package Lesson3;

public class Example {
    class Foo {
        int arg1;
        String arg2;
        double arg3;
        int arg4;
        String arg5;
        int arg6;
        String arg7;

        Foo(Object... args) {

        }
    }

    public void main(String[] args) {
        int arg1;
        String arg7, arg2;
        new Foo(arg1 = 1);
        new Foo(arg1 = 1, arg7 = "qwe");
        new Foo(arg1 = 1, arg7 = "qwe");
        new Foo(arg2 = "qweasd", arg7 = "qwe");
    }

}
