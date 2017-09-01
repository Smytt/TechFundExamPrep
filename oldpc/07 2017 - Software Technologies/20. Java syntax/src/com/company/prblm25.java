package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class prblm25 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Library library = ReadLibrary(scanner);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        Date afterDate = formatDate.parse(scanner.nextLine());
        ArrayList<Book> sortedLibrary = SumOfPrices(library);
        for (Book author : sortedLibrary) {
            if (author.date.after(afterDate)) {
                System.out.printf("%s -> %s%n", author.title, formatDate.format(author.date));
            }
        }
    }

    private static ArrayList<Book> SumOfPrices(Library library) {

        ArrayList<Book> sorted = new ArrayList<>();

        for (Book oneBook : library.books) {
            Book book = new Book();
            book.date = oneBook.date;
            book.title = oneBook.title;
            sorted.add(book);
        }

        sorted.sort((s1, s2) -> {

            Date x1 = ((Book) s1).date;
            Date x2 = ((Book) s2).date;
            int sComp = x1.compareTo(x2);

            if (sComp != 0) return sComp;
            else {
                String y1 = ((Book) s1).title;
                String y2 = ((Book) s2).title;
                return (y1.compareTo(y2));
            }
        });
        return sorted;
    }

    private static Library ReadLibrary(Scanner scanner) throws ParseException {
        Library library = new Library();
        List<Book> books = new ArrayList<Book>();
        int n = Integer.parseInt(scanner.nextLine());
        library.books = books;

        for (int i = 0; i < n; i++) {
            Book book = new Book();
            String[] input = scanner.nextLine().split(" ");
            SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
            book.date = formatDate.parse(input[3]);
            book.title = input[0];
            books.add(book);
        }

        return library;
    }

    static class Library {
        List<Book> books;
    }

    static class Book {
        Date date;
        String title;
    }
}




