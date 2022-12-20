import java.util.ArrayList;

public class Bookcase {
    private ArrayList <Book> bookArray = new ArrayList<Book>();


    public void addBook(Book book){
        bookArray.add(book);
    }

    public void removeBook(String bookName){
        int index = 0;
        for (Book book : bookArray){
            if (book.getTitle().equals(bookName)){
                bookArray.remove(index);
            }
            index ++;
        }
    }

    public void displayBooks(){
        for (Book book : bookArray){
            System.out.println(book.getTitle());
        }
    }
}
