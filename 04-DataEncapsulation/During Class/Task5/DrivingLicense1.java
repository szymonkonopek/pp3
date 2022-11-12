public class DrivingLicense1{
    public String firstName;
    private String lastName;
    private String address;
    private String city;
    private String driverLicenseNumber;
    private int yearOfIssue;
    private String category;
    
    DrivingLicense1(String firstName, String lastName, String address, String city, String driverLicenseNumber, int yearOfIssue, String category){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.driverLicenseNumber = driverLicenseNumber;
        this.yearOfIssue = yearOfIssue;
        this.category = category;
    }
}