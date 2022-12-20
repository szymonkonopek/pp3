public class Email extends Message{
    String subject;
    String address;
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    Email(String subject, String content){
        super(content);
        this.subject = subject;
        
    }

    @Override
    public void send() {
        System.out.println("Email send! content : " + getText() + ", to address : " + address);        
    } 
}
