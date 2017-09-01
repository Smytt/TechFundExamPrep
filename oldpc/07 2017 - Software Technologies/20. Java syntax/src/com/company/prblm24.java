package com.company;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.Console;
import java.util.*;

public class prblm24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = ReadLibrary(scanner);
        ArrayList<Book> sortedLibrary = SumOfPrices(library);
        for (Book author : sortedLibrary) {
            System.out.printf("%s -> %.2f%n", author.author, author.price);
        }
    }

    private static ArrayList<Book> SumOfPrices(Library library) {
        HashMap<String, Double> summedByAuthor = new HashMap<>();

        for (Book book : library.books) {
            if (summedByAuthor.containsKey(book.author)) {
                summedByAuthor.put(book.author, summedByAuthor.get(book.author) + book.price);
                continue;
            }
            summedByAuthor.put(book.author, book.price);
        }

        ArrayList<Book> sorted = new ArrayList<>();

        for (String authorr : summedByAuthor.keySet()) {
            Book book = new Book();
            book.author = authorr;
            book.price = summedByAuthor.get(authorr);
            sorted.add(book);
        }

        sorted.sort((s1, s2) -> {

            Double x1 = ((Book) s1).price;
            Double x2 = ((Book) s2).price;
            int sComp = x2.compareTo(x1);

            if (sComp != 0) return sComp;
            else {
                String y1 = ((Book) s1).author;
                String y2 = ((Book) s2).author;
                return (y1.compareTo(y2));
            }
        });
        return sorted;
    }

    private static Library ReadLibrary(Scanner scanner) {
        Library library = new Library();
        List<Book> books = new ArrayList<Book>();
        int n = Integer.parseInt(scanner.nextLine());
        library.books = books;

        for (int i = 0; i < n; i++) {
            Book book = new Book();
            String[] input = scanner.nextLine().split(" ");
            book.author = input[1];
            book.price = Double.parseDouble(input[input.length - 1]);
            books.add(book);
        }

        return library;
    }

    static class Library {
        String name;
        List<Book> books;
    }

    static class Book {
        String author;
        double price;
    }
}




