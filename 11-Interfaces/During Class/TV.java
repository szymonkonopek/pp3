public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int channelNo;
    private int currentVolume;

    public TV() {
        this.isOn = false;
        this.channelNo = 1;
        this.currentVolume = 1;
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
            System.out.println("Current channel : " + channelNo);
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

    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        tv.displayStatus();
        tv.setChannel(15);
        for (int i = 0; i < 6; i++){
            tv.volumeUp();
        }
        tv.displayStatus();
        tv.off();
        tv.displayStatus();
    }
}
