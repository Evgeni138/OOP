package phonebook;

import java.util.Scanner;

public class View {
    // Опичывается метод ввода данных при создании нового контакта
    Contact setContact() {
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Input ID");
        int iD = iScaner.nextInt();
        System.out.println("Input firstName");
        String firstName = iScaner.next();
        System.out.println("Input lastName");
        String lastName = iScaner.next();
        System.out.println("Input number");
        String number = iScaner.next();
        System.out.println("Input descripction");
        String descripction = iScaner.next();
        return new Contact(iD, firstName, lastName, number, descripction);
    }

    // Описывается метод ввод ID для дальнейших обработок контакта
    int setID () {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input ID to use: ");
        int iD = iScanner.nextInt();
        return iD;
    }
}
