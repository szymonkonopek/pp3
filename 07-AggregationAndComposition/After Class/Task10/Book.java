public class Book {
    private Writer writer;
    private int numOfPages;
    private String title;
    private String category;
    private int currPage;

    public Book(Writer writer, int numOfPages, String title, String category, int currPage) {
        this.writer = writer;
        this.numOfPages = numOfPages;
        this.title = title;
        this.category = category;
        this.currPage = currPage;
    }

    public void read(){

    }

    public void nextPage(){
        this.currPage ++;
    }

    public String getTitle(){
        return this.title;
    }

    public void prevPage(){
        this.currPage --;
    }
    
    public void goToPage(int page){
        this.currPage = page;
    }
}
