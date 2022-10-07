package hW5Args;

public class Program {
    public static void main(String[] args) {
        Args args1 = new Args.Builder(1)
                .setArg2("arg2")
                .build();

        System.out.println(args1);
    }

}
