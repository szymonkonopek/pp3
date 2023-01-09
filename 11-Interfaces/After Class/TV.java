public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int channelNo;
    private int currentVolume;
    private String[] tvStations;

    public TV() {
        this.isOn = false;
        this.channelNo = 1;
        this.currentVolume = 1;
        this.tvStations = new String[100];
        
        for (int i = 0; i < 10; i ++)
        tvStations[i] = "TVP " + (i + 1);
    }

    public void on(){
        isOn = true;
    }

    public void off(){
        isOn = false;
    }

    public void channelUp(){
        if (isOn && channelNo < 99){
            channelNo ++;
        }
    }

    public void channelDown(){
        if (isOn && channelNo > 0){
            channelNo --;
        }
    }

    public void setChannel(int channelNum){
        if (channelNum >= 1 && channelNum <= 99){
            channelNo = channelNum;
        }
        else{
            System.out.println("Channel now allowed");
        }
    }

    public void displayStatus(){
        if (isOn){
            System.out.println("TV is on");
            System.out.println("Current channel : " + tvStations[channelNo]);
            System.out.println("Current Volume : " + currentVolume);
        }
        else {
            System.out.println("TV is off");
        }
    }

    public void volumeUp(){
        if (isOn){
            currentVolume ++;
        }
    }

    public void volumeDown(){
        if (isOn){
            currentVolume --;
        }
    }

    public void displayTVStations(){
        int i = 0;
        for (String station : tvStations){
            System.out.println((i + 1)+ ". "+ station);
            i ++;
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        tv.displayTVStations();
        tv.displayStatus();
    }
}
