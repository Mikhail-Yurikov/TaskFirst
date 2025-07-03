package bookauthor;

public class Book {
    String title;
    int releaseYear;
    Author author;
    int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    boolean isBig() {
        return pages > 500;
    }

    boolean mathes(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    int estimatePrice() {
        int price = (int) Math.floor(Math.sqrt(author.rating) * 3 * pages);
        return Math.max(price, 250);
    }
}
