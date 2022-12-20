public class DrivingLicense2{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String driverLicenseNumber;
    private int yearOfIssue;
    private String category;
    
    DrivingLicense2(String firstName, String lastName, String address, String city, String driverLicenseNumber, int yearOfIssue, String category){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.driverLicenseNumber = driverLicenseNumber;
        this.yearOfIssue = yearOfIssue;
        this.category = category;
    }

    public void displayLicense(){
        System.out.println("--== Your Driver's License ==--");
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Address : " + this.address);
        System.out.println("City : " + this.city);
        System.out.println("Driver License Number : " + this.driverLicenseNumber);
        System.out.println("Year of Issue : " + this.yearOfIssue);
        System.out.println("Category : " + this.category);
    }
}