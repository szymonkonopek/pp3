public class DrivingLicense5{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String driverLicenseNumber;
    private int yearOfIssue;
    private String category;
    
    DrivingLicense5(String firstName, String lastName, String address, String city, String driverLicenseNumber, int yearOfIssue, String category){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.driverLicenseNumber = driverLicenseNumber;
        this.yearOfIssue = yearOfIssue;
        this.category = category;
    }

    String getFirstName(){
        return this.firstName;
    }

    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    String getLastName(){
        return this.lastName;
    }

    void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    String getAddress(){
        return this.address;
    }

    void setAddress(String newAddress){
        this.address = newAddress;
    }

    String getCity(){
        return this.city;
    }

    void setCity(String newCity){
        this.city = newCity;
    }

    String getDriverLicenseNumber(){
        return this.driverLicenseNumber;
    }
    
    void setDriverLicenseNumber(String newDriverLicenseNumber){
        this.driverLicenseNumber = newDriverLicenseNumber;
    }

    int getYearOFIssue(){
        return this.yearOfIssue;
    }
    
    void setYearOFIssue(int newYearOfIssue){
        if (newYearOfIssue > 1980 && newYearOfIssue <= 2022){
            this.yearOfIssue = newYearOfIssue;
        }
    }

    String getCategory(){
        return this.category;
    }

    void setCategory(String newCategory){
        this.category = newCategory;
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

    public String toString(){
        return getFirstName() + " " + getLastName() + " " + getDriverLicenseNumber() + " " + getCategory() + " " + getAddress() + " " + getCity() + " " + getYearOFIssue();
    }
}