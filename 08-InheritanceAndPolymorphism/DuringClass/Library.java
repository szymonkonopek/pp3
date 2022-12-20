import java.util.ArrayList;

class Library{
    public Library(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    private ArrayList<Book> shelf = new ArrayList<Book>();

    public void display(){
        System.out.println("======= Library ======");
        for (Book book : shelf){
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
        }
        System.out.println("=======================");
    }
}