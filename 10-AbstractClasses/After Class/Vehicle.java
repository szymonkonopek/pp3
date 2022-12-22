public abstract class Vehicle {
    private int maxSpeed;
    private String brand;
    private String model;
    private Boolean isEngineOn;

    public Vehicle(int maxSpeed, String brand, String model) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
    }

    abstract void drive();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getIsEngineOn() {
        return isEngineOn;
    }

    public void setIsEngineOn(Boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    public static void main(String[] args) {
        Car c = new Car(240, "BMW", "M8");
        Bus b = new Bus(120, "Mercedes", "Bus");
        Truck t = new Truck(120, "Volvo", "Truck");

        c.setIsEngineOn(true);
        b.setIsEngineOn(true);
        t.setIsEngineOn(true);

        c.drive();
        b.drive();
        t.drive();
    }

}
