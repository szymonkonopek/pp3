class Book{
    String book_name;
    int num_of_pages;
    Boolean is_in_polish;
    float price;

    Book(String book_name, int num_of_pages, Boolean is_in_polish, float price){
        this.book_name = book_name;
        this.num_of_pages = num_of_pages;
        this.is_in_polish = is_in_polish;
        this.price = price;
    }

    float get_price_per_page(){
        return this.price / this.num_of_pages;
    }

    String get_name(){
        return this.book_name;
    }
}

class Task14{   
    public static void main(String[] args){
        System.out.println("test");
        Book book1 = new Book("Harry Potter", 169, false, 30f);
        Book book2 = new Book("Pan Tadeusz", 420, true, 15f);

        System.out.println("Book1");
        System.out.println(book1.get_price_per_page());
        System.out.println(book1.get_name());

        System.out.println("Book2");
        System.out.println(book2.get_price_per_page());
        System.out.println(book2.get_name());
    }
}
