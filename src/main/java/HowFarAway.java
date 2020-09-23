import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startLat; //starting latitude
        double startLong; //starting longitude
        double endLat; //ending latitude
        double endLong; //ending latitude
        double distance; //distance between two points

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the latitude of the starting location: ");
        startLat = scanner.nextDouble();

        System.out.print("Enter the longitude of the starting location: ");
        startLong = scanner.nextDouble();

        System.out.print("Enter the latitude of the ending location: ");
        endLat = scanner.nextDouble();

        System.out.print("Enter the longitude of the ending location: ");
        endLong = scanner.nextDouble();

        GeoLocation myStartGeoLocation = new GeoLocation(startLat, startLong);

        GeoLocation myEndGeoLocation = new GeoLocation(endLat, endLong);

        distance = myStartGeoLocation.distanceFrom(myEndGeoLocation);

        System.out.print("The distance is " + distance + " miles.");
    }
}