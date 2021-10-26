package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        book.setName("Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName());
            Book temp = books[0];
            books[0] = books[3];
            books[3] = temp;
            System.out.println(bks.getName());
            if (books[i].equals("Clean code")) {
                System.out.println(bks.getName());
            }
        }
    }
}
