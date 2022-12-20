public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display(){
        System.out.println("Title = " + getTitle());
        System.out.println("Author = " + getAuthor());
        System.out.println("Seconds = " + this.seconds);
        System.out.println("Minutes " + this.minutes);
        System.out.println();
    }
}
