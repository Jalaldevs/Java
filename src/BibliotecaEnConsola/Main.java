package BibliotecaEnConsola;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BookController.main(null);

        ArrayList<Book> islamicLibrary = new ArrayList<>(BookService.allBooks);

        System.out.println(BookService.sortByPriceAsc());

    }

}
