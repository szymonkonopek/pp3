public class Date {
    public static void main(String[] args){
        //Powinno nazywać się Date.java
        String weekday = "Wtorek";
        String month = "Październik";
        String dayOfTheWeek = "12";
        String year = "2022";
        
        //US
        System.out.println(String.format("%1$s, %2$s %3$s, %4$s", weekday, month, dayOfTheWeek, year));
        //EU
        System.out.println(String.format("%1$s %2$s %3$s, %4$s", weekday, dayOfTheWeek, month, year));
    }    
}
