public abstract class Message {
    private String text;

    Message(){

    }

    Message(String text){
        this.text = text;
    }

    int charNumber(){
        return text.length();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract void send();

    public static void main(String[] args) {
        SMS sms = new SMS("5095123123");
        sms.setText("hello");
        sms.send();

        sms.setText("how are you?");
        sms.send();

        System.out.println();

        Email email = new Email("Promotion", "you earned a promotion!");
        email.setAddress("szef@gmail.com");
        email.send();
    }
}
