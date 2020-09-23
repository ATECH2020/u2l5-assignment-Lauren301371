import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double taxRate;
        int numLumber;
        int numWindow;
        double lumberCost;
        double windowCost;
        double total;
        double grandTotal;

        Scanner scanner = new Scanner(System.in);
        //Creates a new scanner for user input

        System.out.println("Enter the sales tax rate:");
        taxRate = scanner.nextDouble();

        System.out.println("How many boards do you need?");
        numLumber = scanner.nextInt();

        System.out.println("How many windows do you need?");
        numWindow = scanner.nextInt();

        Construction myConstruction = new Construction(8, 11, taxRate);

        lumberCost = myConstruction.lumberCost(numLumber);
        windowCost = myConstruction.windowCost(numWindow);

        total = lumberCost + windowCost;

        grandTotal = myConstruction.grandTotal(total);

        System.out.println("Total: " + total);
        System.out.print("Grand Total: " + grandTotal);

    }
}
