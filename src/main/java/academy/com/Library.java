package academy.com;

import java.util.List;
import java.util.Locale;

public class Library {

    public static void main(String[] args) {

        List<Book> bookList = List.of(
                new Book("How to something", 200),
                new Book("How to", 100),
                new Book("How", 1050),
                new Book("Some Title", 20)
        );

        Library library = new Library(bookList);

        System.out.println(library.totalBookCount());
        library.getAllBooks();
        library.findBookByTitle("So");
        library.findBookByBiggestPageSize();
    }


    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public int totalBookCount() {
        int count = 0;
        for (Book book : books) {
            count++;
        }
        return count;
    }

    public void getAllBooks() {
        String title = "";
        int pages = 0;
        for (Book book : books) {
            title = book.getTitle().toLowerCase(Locale.ROOT);
            pages = book.getPages();
            System.out.println("Book '" + title + "' with " + pages + " pages.");
        }
    }

    public void findBookByTitle(String title) {
        for (Book book : books) {
            if (title.toLowerCase(Locale.ROOT).equals(book.getTitle().toLowerCase(Locale.ROOT))) {
                System.out.println("Book '" + book.getTitle() + "' with " + book.getPages() + " pages.");
            }
        }
    }

    public void findBookByBiggestPageSize() {
        int pages = 0;
        String title = "";
        for (Book book : books) {
            if (pages < book.getPages()) {
                pages = book.getPages();
                title = book.getTitle();
            }
        }
        System.out.println("Book with highest amount of pages: '" + title + "' with " + pages + " pages");
    }

}