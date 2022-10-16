package Lesson5.Ex001Calc;

import java.util.Scanner;

public class ConsoleView implements View{

    Scanner iScanner = new Scanner(System.in);
    @Override
    public int getX() {
        System.out.println("Input a: ");
        return iScanner.nextInt();
    }

    @Override
    public int getY() {
        System.out.println("Input b: ");
        return iScanner.nextInt();
    }

//    @Override
//    public void printf(String title, int data) {
//        System.out.println(title);
//    }
    @Override
    public void print(String title, int data) {
        System.out.printf("%s %d \n", title, data);
    }
}
