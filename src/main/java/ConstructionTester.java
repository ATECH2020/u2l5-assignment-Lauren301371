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

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Asks the user to enter the sale tax rate
        System.out.println("Enter the sales tax rate:");
        taxRate = scanner.nextDouble();

        //Asks the user to enter the number of boards
        System.out.println("How many boards do you need?");
        numLumber = scanner.nextInt();

        //Asks the user to enter the number of windows
        System.out.println("How many windows do you need?");
        numWindow = scanner.nextInt();

        //Creates a new Construction object and initializes its variables
        Construction myConstruction = new Construction(8, 11, taxRate);

        //Calculates the cost of the total number of lumber and windows
        lumberCost = myConstruction.lumberCost(numLumber);
        windowCost = myConstruction.windowCost(numWindow);

        //Adds the costs into one total
        total = lumberCost + windowCost;

        //Calculates the final total with the sales tax
        grandTotal = myConstruction.grandTotal(total);

        //Prints out total and total w/tax
        System.out.println("Total: " + total);
        System.out.print("Grand Total: " + grandTotal);

    }
}
