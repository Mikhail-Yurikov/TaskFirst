package bookauthor;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("A", "A", 3);
        Author author2 = new Author("B", "B", 4);

        Book book1 = new Book("AAa", 2025, author1, 5);
        Book book2 = new Book("BBb", 2025, author2, 100);

        System.out.println(book1.mathes("A") + " " + book1.estimatePrice() + " " + book1.isBig());
        System.out.println(book2.mathes("C") + " " + book2.estimatePrice() + " " + book2.isBig());


    }
}
