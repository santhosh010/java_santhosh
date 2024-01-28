package Set_1;
import java.util.Scanner;

public class OxygenPlants {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totPlants;
        float areaRoom, areaPlant, l, b;
        double totOxy;
        System.out.println("Enter Length of the room (in m)");
        l = s.nextFloat();
        if(l<=0) {
        	System.out.println("Invalid Length");
        	return;
        }
        System.out.println("Enter Breadth of the room (in m)");
        b = s.nextFloat();
        if(b<=0) {
        	System.out.println("Invalid Length");
        	return;
        }
        System.out.println("Enter the plant area of a single plant (in cm2)");
        areaPlant = s.nextFloat();
        if(areaPlant<=0) {
        	System.out.println("Invalid Length");
        	return;
        }

        // Convert plant area to square meters
        areaPlant /= 10000;

        // Room area
        areaRoom = (l * b);
        totPlants = (int) (Math.floor((areaRoom/areaPlant)/10))*10;
        totOxy = (float) totPlants * 0.9;
        System.out.println("Total number of plants is " + totPlants);
        System.out.println("Total oxygen production is "+ totOxy + " litres");
        s.close();

    }
}

