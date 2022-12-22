public class User {
    String firstName;
    String lastName;
    Email email;
    SMS phone;

    public User(String firstName, String lastName, Email email, SMS phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public static void main(String[] args) {
        User user = new User("Szymon", "Marczewski", new Email("szymon.marczewski@gmail.com"), new SMS("123-543-452"));
        
        user.email.setText("You are fired!");
        user.email.setSubject("Sad news...");
        user.email.setToAdress("employee@gmail.com");
        user.email.send();

        user.phone.setText("Obama is dead");
        user.phone.send();
    }
}