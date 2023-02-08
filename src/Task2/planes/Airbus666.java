package Task2.planes;

public class Airbus666 extends Plane {
    private int cargoVolume;

    public Airbus666(){
        super ();
    }

    public Airbus666(int capacity, int loadCapacity, int flightRange, int fuelConsumption, int cargoVolume, String boardNumber) {
        super(capacity, loadCapacity, flightRange, fuelConsumption, boardNumber);
        this.cargoVolume = cargoVolume;
        this.setName("AirBus666");
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(int cargoVolume) {
        this.cargoVolume = cargoVolume;

    }
}
