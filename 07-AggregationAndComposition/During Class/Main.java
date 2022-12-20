public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer(null, null, 0, false);
        Book book = new Book(writer, 0, null, null, 0);
        book.goToPage(10);
    }
}
