public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] specArray = {getSeats(), this.maxSpeed};
        return specArray;
    }

    public static void main(String[] args) {
        Car c = new Car(2, 120);
        System.out.println(c.spec()[0]);
        System.out.println(c.spec()[1]);
    }
}
