package Task2;

import Task2.planes.Airbus666;
import Task2.planes.Boeing747;
import Task2.planes.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AnnaAirlines annaAirlines = new AnnaAirlines();
        Boeing747 boeing747 = new Boeing747(250, 5000, 2000, 63, "1");
        Airbus666 airbus666 = new Airbus666(0, 50000, 5000, 100, 250, "1");
        Airbus666 airbus6662 = new Airbus666(0, 50000, 2500, 100, 250, "2");
        annaAirlines.addPlane(boeing747);
        annaAirlines.addPlane(airbus666);
        annaAirlines.addPlane(airbus6662);

        System.out.println(annaAirlines.getTotalCapacity());
        System.out.println(annaAirlines.getLoadCapacity());


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fuel minimal consumption: ");
        int minFuelConsumption = sc.nextInt();

        System.out.println("Enter fuel maximum consumption: ");
        int maxFuelConsumption = sc.nextInt();
        sc.close();

        List<Plane> planesByConsumption = annaAirlines.getPlanesByConsumption (minFuelConsumption, maxFuelConsumption);

        System.out.println(planesByConsumption);

        List<Plane> sortedPlanes = annaAirlines.getPlanesSortedByFlightRange();

        for (Plane sortedPlane : sortedPlanes) {
            System.out.println(sortedPlane + ": " + sortedPlane.getFlightRange());
        }

    }

}
