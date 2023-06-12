package org.example;

public class Book {
    private final String author;
    private final String title;
    private final int pages;
    private final double price;

    public Book(String[] bookData) {
        this.author = bookData[0];
        this.title = bookData[1];
        this.pages = Integer.parseInt(bookData[2]);
        this.price = Double.parseDouble(bookData[3]);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
