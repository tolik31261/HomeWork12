public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book book = new Book("Капитанская дочка", 1836, pushkin);
        Author gogol = new Author("Николай", "Гоголь");
        Book book1 = new Book("Мертвые души", 1842, gogol);
        book1.setReleaseYear(1845);
        System.out.println(book);
        System.out.println(book1);
    }
}