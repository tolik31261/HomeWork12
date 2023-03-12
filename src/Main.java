public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Алекссандр", "Пушкин");
        Book book = new Book("Капитанская дочка", 1836, pushkin);
        Author gogol = new Author("Nikolai", "Gogol");
        Book book1 = new Book("Мертвые души", 1842, gogol);
    }
}