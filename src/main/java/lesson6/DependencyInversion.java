package lesson6;

public class DependencyInversion {
    public static void main(String[] args) {
        Book book = new Book();
        book.viewAuthor();
    }
}

interface View {
    void print(String text);
}

class WinFormView implements View {
    @Override
    public void print(String text) {
        String reult = String.format("WinFormView %s", text);
        System.out.println(reult);
    }
}
class ConsolView implements View {
    @Override
    public void print(String text) {
        String result = String.format("ConsolView %s", text);
        System.out.println(result);
    }
}

class Book {
    View view;
    int indexPage;

    public Book() {
        this.view = new WinFormView();
        indexPage = 1;
    }

    public void viewTitle() {
        view.print("The title of book");
    }

    public void viewAuthor() {
        view.print("The book author");
    }

    public void turnPage(int page) {
        if (page >= 1 && page <= 300)
            this.indexPage = page;
    }

    public void viewCurrentPage() {
        view.print(String.format("Page: %d", indexPage));
    }
}
