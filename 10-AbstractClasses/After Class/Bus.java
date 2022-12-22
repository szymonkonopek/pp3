public class Bus extends Vehicle {

    public Bus(int maxSpeed, String brand, String model) {
        super(maxSpeed, brand, model);
    }

    void drive(){
        if (getIsEngineOn()){
            System.out.println("Bus is driving");
        }
        else{
            System.out.println("Turn the bus on!");
        }
    }
    
}
