import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги: '" + nameBook + '\'' +
                ", год издания: " + releaseYear +
                ", автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, releaseYear, author);
    }
}
