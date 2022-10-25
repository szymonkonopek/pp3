public class Task20 {
    public static class Clock {
        int hour;
        int minute;

        Clock(){
            this.hour = 0;
            this.minute = 0;
        }

        Clock(int hour, int minute){
            this.hour = hour;

            if (hour < 0) {
                this.hour = 0;
            }
            else if (hour > 23){
                this.hour = 23;
            }

            if (minute < 0){
                this.minute = 0;
            }
            else if (minute > 59){
                this.minute = 59;
            }
            
            this.minute = minute;
        }

        void setClock(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
        }

        void setClock(){
            this.hour = 0;
            this.minute = 0;
        }

        void displayTime(){
            String tempHour = Integer.toString(this.hour);
            String tempMinute = Integer.toString(this.minute);
            if (this.hour < 10){
                tempHour = "0" + Integer.toString(this.hour);
            }
            
            if (this.minute < 10){
                tempMinute = "0" + Integer.toString(this.minute);
            } 

            System.out.println(tempHour + " : " + tempMinute);
        }

        void addOneMinute(){
            this.minute += 1;
            if (this.minute > 59){
                this.minute = 0;
                this.hour += 1;
                if (this.hour > 23){
                    this.hour = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        Clock c = new Clock(12,47);
        c.displayTime();
        c.setClock(18,14);
        c.displayTime();
        c.setClock(9,3);
        c.displayTime();
        c.setClock(23,58);
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
    }
}
