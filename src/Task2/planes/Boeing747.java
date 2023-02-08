package Task2.planes;

public class Boeing747 extends Plane {

    public Boeing747(){
        super ();
    }

    public Boeing747(int capacity, int loadCapacity, int flightRange, int fuelConsumption, String boardNumber) {
        super(capacity, loadCapacity, flightRange, fuelConsumption, boardNumber);
        this.setName("Boeing747");
    }
}
