import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        boolean done = false;
        
        while (!done) {
        	try {
        		// Prompt user to input wall's height
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();

        		// Error handling
        		if (wallHeight <= 0) {
        			throw new Exception("Invalid height.");
        		}

        		// Prompt user to input wall's width
        		System.out.println("Enter wall width (feet): ");
        		wallWidth = scnr.nextDouble();

        		// Error handling
        		if (wallWidth <= 0) {
        			throw new Exception("Invalid width.");
        		}

        		// Calculate and output wall area
        		wallArea = wallHeight * wallWidth;
        		System.out.println("Wall area: " + wallArea + "  square feet");

        		// Calculate and output the amount of paint (in gallons) needed to paint the wall
        		gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        		System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        		done = true;
        	}
        	catch (Exception excpt) {
        		// Print Errors
        		System.out.println(excpt.getMessage());
        		System.out.println("Cannot compute gallons needed.");
        	}
        }
    }
}
