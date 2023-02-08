package Task2;

import Task2.planes.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnnaAirlines {

    private final List<Plane> planes;

    public AnnaAirlines() {
        this.planes = new ArrayList<>();
    }

    public void addPlane(Plane plane){
        planes.add(plane);
    }

    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Plane plane : planes) {
            totalCapacity = totalCapacity + plane.getCapacity();
        }
        return totalCapacity;
    }
    public int getLoadCapacity() {
        int loadCapacity = 0;
        for (Plane plane : planes) {
            loadCapacity = loadCapacity + plane.getLoadCapacity();
        }
        return loadCapacity;
    }

    public List<Plane> getPlanesByConsumption(int min, int max) {
        List<Plane> result = new ArrayList<>();
        for (Plane currentPlane : planes) {
            if (currentPlane.getFuelConsumption() >= min && currentPlane.getFuelConsumption() <= max) {
                result.add(currentPlane);
            }
        }
        return result;
    }

    public List<Plane> getPlanesSortedByFlightRange() {
        List<Plane> result = new ArrayList<>(planes);
        result.sort(Comparator.comparingInt(Plane::getFlightRange));
        return result;
    }

    public void printAllPlanes() {
        System.out.println(planes);
    }

}
