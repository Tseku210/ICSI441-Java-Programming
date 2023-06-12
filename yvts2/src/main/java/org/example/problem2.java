package org.example;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class problem2 {
    public static void main(String[] args) {
        String file = "/Users/tsenguunotgonbaatar/dev/java_programming/yvts2/src/main/resources/books.txt";

        try {
            List<Book> books = readBooksFromFile(file);

            Optional<Book> cheapestBook = findCheapestBook(books);
            cheapestBook.ifPresentOrElse(book -> System.out.println("Hamgiin hymdhan nom: " + book),
                    () -> System.out.println("Nom bhgu baina"));

            Optional<Book> bookWithFewestPages = findBookWithFewestPagesFromMostExpensive(books);
            bookWithFewestPages.ifPresentOrElse(book -> System.out.println("Hamgiin unetei nomnuudaas hamgiin tsuuhun huudastai nom: " + book),
                    () -> System.out.println("Nom bhgu baina"));

            double expensivePrice = 10.0;
            int shortPagesCount = 150;
            List<Book> shortBooksFromMostExpensive = findShortBooksFromMostExpensive(books, expensivePrice, shortPagesCount);
            System.out.print("Hamgiin tsuuhun huudastai ch unetei nomnuud: ");
            if (shortBooksFromMostExpensive.size() > 0) {
                shortBooksFromMostExpensive.forEach(System.out::print);
            } else {
                System.out.print("Nomnuud oldsongui");
            }

        } catch(IOException e) {
            System.out.println("File unshij chadsangue: " + e.getMessage());
        }
    }

    public static List<Book> readBooksFromFile(String file) throws IOException {
        return Files.lines(Paths.get(file))
                .map(line -> line.split(","))
                .map(Book::new)
                .toList();
    }

    public static Optional<Book> findCheapestBook(List<Book> books) {
        return books.stream()
                .min(Comparator.comparing(Book::getPrice));
    }

    public static Optional<Book> findBookWithFewestPagesFromMostExpensive(List<Book> books) {
        Optional<Book> maxPriceBook = books.stream()
                .max(Comparator.comparing(Book::getPrice));

        return maxPriceBook.flatMap(maxBook ->
                books.stream()
                        .filter(book -> book.getPrice() == maxBook.getPrice())
                        .min(Comparator.comparing(Book::getPages))
        );
    }

    public static List<Book> findShortBooksFromMostExpensive(List<Book> books, double expensiveThreshold, int shortBookPageThreshold) {

        return books.stream()
                .filter(book -> book.getPrice() >= expensiveThreshold && book.getPages() <= shortBookPageThreshold)
                .toList();
    }
}
