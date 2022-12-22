public class Truck extends Vehicle {

    public Truck(int maxSpeed, String brand, String model) {
        super(maxSpeed, brand, model);
        //TODO Auto-generated constructor stub
    }
    
    void drive(){
        if (getIsEngineOn()){
            System.out.println("Truck is driving");
        }
        else{
            System.out.println("Turn the truck on!");
        }
    }
}
