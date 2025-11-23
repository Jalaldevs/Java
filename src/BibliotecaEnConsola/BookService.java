package BibliotecaEnConsola;
import java.util.ArrayList;

public class BookService {

    static ArrayList<Book> allBooks = new ArrayList<>();

    public static ArrayList<Book> addingBooks (int id, String name, String editorial, String author, int age, double price) {
        Book createdBook = new Book(id, name, editorial, author, age, price);
        allBooks.add(createdBook);
        return allBooks;
    }

    public static ArrayList<Book> addingBooks (int id, String name, double price) {
        Book createdBook = new Book(id, name, price);
        allBooks.add(createdBook);
        return allBooks;
    }

    public static ArrayList<Book> findBookByAuthor(String authorName) {
        ArrayList<Book> allBooksByAuthor = new ArrayList<>();

        for (int i = 0; i < allBooks.size(); i++) {
            if (authorName.equalsIgnoreCase(allBooks.get(i).getAuthor())) {
                allBooksByAuthor.add(allBooks.get(i));
            }
        }

        return allBooksByAuthor;
    }

    public static ArrayList<Book> sortByPriceAsc() {
        allBooks.sort((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
        return allBooks;
    }

    public static ArrayList<Book> sortByPriceDes() {
        allBooks.sort((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()));
        return allBooks;
    }

}
