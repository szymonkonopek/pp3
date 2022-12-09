public class Ebook extends Book {
    private String filename;

    public Ebook(String title, String author, String filename) {
        super(title, author);
        this.filename = filename;
        
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void display(){
        System.out.println("Title = " + getTitle());
        System.out.println("Author = " + getAuthor());
        System.out.println("filename = " + this.filename);
        System.out.println("Publisher : " + this.getPublisher());
        System.out.println("Year of release : " + this.getYearOfPublication());
        System.out.println("Writer : " + this.getWriter().getFirstName());
        System.out.println();
    }
}
