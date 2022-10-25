public class CinemaTicketModified {
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    float price;
    
    CinemaTicketModified(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if (row <= 2){
            this.price = 10;
        }
        else {
            this.price = 25;
        }
    }
    
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
        CinemaTicketModified t1 = new CinemaTicketModified("Spiderman", 1, 5);
        CinemaTicketModified t2 = new CinemaTicketModified("Spiderman", 5, 2);
    
        t1.printTicket();
        t2.printTicket();
    }
}