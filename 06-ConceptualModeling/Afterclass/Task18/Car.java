public class Car {
    private String brand;
    private String model;
    private boolean isOpen;
    private boolean isDriving;
    private int currentSpeed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
    }

    void useKeys(){
        isOpen = !isOpen;
    }

    void driveCar(){
        if (isOpen){
            isDriving = true;
            currentSpeed = 50;
        }
        else {System.out.println("Car is closed!");}
        
    }

    void stopDriving(){
        isDriving = false;
        currentSpeed = 0;
    }

    public void showSpeed() {
        System.out.println("Current speed : " + currentSpeed);;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Bmw","3");
        Car c2 = new Car("Audi","A3");
        Car c3 = new Car("Mercedes", "C class");

        c1.driveCar();
        c1.showSpeed();
        c1.useKeys();
        c1.driveCar();
        c1.showSpeed();
    }

}
