public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    private String yearOfPublication;
    private Writer writer;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void display(){
        System.out.println("Title" + this.title);
        System.out.println("Author" + this.author);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("Year of release : " + this.yearOfPublication);
        System.out.println("Writer : " + getWriter().getFirstName() + " " +  getWriter().getLastName());
        System.out.println("");

    }


}
