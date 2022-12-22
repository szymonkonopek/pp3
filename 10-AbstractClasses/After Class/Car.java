public class Car extends Vehicle{

    public Car(int maxSpeed, String brand, String model) {
        super(maxSpeed, brand, model);
    }

    void drive(){
        if (getIsEngineOn()){
            System.out.println("Car is driving");
        }
        else{
            System.out.println("Turn the car on!");
        }
    }

}
