public class CinemaTicket {
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    float price;
    
    static void displayCinemaName(){
        System.out.println(cinemaName);
    }

    
    void displayTicketDetails(){
        System.out.println(filmTitle);
        System.out.println(row);
        System.out.println(filmTitle);
        System.out.println(seat);
        System.out.println(price);
    }
    
    void printTicket(){
        System.out.println(cinemaName);
        System.out.println(filmTitle);
        System.out.println(row);
        System.out.println(filmTitle);
        System.out.println(seat);
        System.out.println(price);
    }
    
    public static void main(String[] args){
        CinemaTicket c1 = new CinemaTicket();
        CinemaTicket c2 = new CinemaTicket();        
        
        c1.filmTitle = "Film1";
        c1.row = 9;
        c1.seat = 4;
        c1.price = 19.5f;
        
        c2.filmTitle = "Film2";
        c2.row = 123;
        c2.seat = 4;
        c2.price = 19.5f;
        
        
    }
}