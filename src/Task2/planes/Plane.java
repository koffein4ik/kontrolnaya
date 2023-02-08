package Task2.planes;

public abstract class Plane {

    private int capacity;
    private int loadCapacity;
    private int flightRange;
    private int fuelConsumption;
    private String name;
    private String boardNumber;


    public Plane(int capacity, int loadCapacity, int flightRange, int fuelConsumption, String boardNumber) {
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.boardNumber = boardNumber;
    }

    public Plane() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(String boardNumber) {
        this.boardNumber = boardNumber;
    }

    @Override
    public String toString() {
        return getName() + "-" + getBoardNumber();
    }
}
