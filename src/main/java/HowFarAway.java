import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startLat; //starting latitude
        double startLong; //starting longitude
        double endLat; //ending latitude
        double endLong; //ending longitude
        double distance; //distance between the two points

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Asks the user to enter the latitude of the starting location
        System.out.print("Enter the latitude of the starting location: ");
        startLat = scanner.nextDouble();

        //Asks the user to enter the longitude of the starting location
        System.out.print("Enter the longitude of the starting location: ");
        startLong = scanner.nextDouble();

        //Asks the user to enter the latitude of the ending location
        System.out.print("Enter the latitude of the ending location: ");
        endLat = scanner.nextDouble();

        //Asks the user to enter the longitude of the ending location
        System.out.print("Enter the longitude of the ending location: ");
        endLong = scanner.nextDouble();

        //Creates a new GeoLocation object for the starting location
        //and initializes its variables
        GeoLocation myStartGeoLocation = new GeoLocation(startLat, startLong);

        //Creates a new GeoLocation object for the ending location
        //and initializes its variables
        GeoLocation myEndGeoLocation = new GeoLocation(endLat, endLong);

        //Gets the distance between the starting and ending locations
        distance = myStartGeoLocation.distanceFrom(myEndGeoLocation);

        //Prints out the distance
        System.out.print("The distance is " + distance + " miles.");
    }
}