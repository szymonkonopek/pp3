public class SMS extends Message {
    String phoneNum;

    SMS(String phoneNum){
        super();
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void send(){
        System.out.println("SMS sent! with content : " + getText());
    }
}
