public class Book {
    private final String nameBook;
    private int releaseYear;
    private final Author author;

    public Book(String nameBook, int releaseYear, Author author) {
        this.nameBook = nameBook;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
