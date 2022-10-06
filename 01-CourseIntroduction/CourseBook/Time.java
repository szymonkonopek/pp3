import java.time.LocalDateTime;  
public class Time {
    public static void main(String[] args){
        int hours = LocalDateTime.now().getHour();
        int minutes = LocalDateTime.now().getMinute();;
        int secounds = LocalDateTime.now().getSecond();
        int fullDayInSec = 86400;
        int currentDay = hours * 3600 + minutes * 60 + secounds;
        int dayPercentage = (int)(((float)currentDay / fullDayInSec) * 100);
        //Time since mid-night in sec
        System.out.println(currentDay);

        //Time to mid-night
        System.out.println(fullDayInSec - currentDay);

        //Percentage of the day that passed
        System.out.println(String.format("%d%%",dayPercentage));
    
    }    
}
