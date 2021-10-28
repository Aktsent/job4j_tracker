package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 5);
        Book book1 = new Book("Book 1", 6);
        Book book2 = new Book("Book 2", 7);
        Book book3 = new Book("Book UP", 8);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName());
        }
        System.out.println();
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName());
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(book.getName());
            }
        }
    }
}
