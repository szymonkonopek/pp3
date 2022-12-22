public class Email extends Message{
    String subject;
    String address;
    String toAdress;
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getToAdress() {
        return toAdress;
    }
    public void setToAdress(String toAdress) {
        this.toAdress = toAdress;
    }

    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    } 

    Email(String subject, String content){
        super(content);
        this.subject = subject;
    }

    Email(String address){
        super();
        this.address = address;
    }

    @Override
    public void send() {
        System.out.println("Email sent! content : " + getText() + ", from address : " + address + ", to address : " + toAdress + "\n");        
    }



}
