
import java.util.Scanner;
public class SquareCalculator {
    
    public static void squuare_Area() {
        Scanner scan = new Scanner(System.in); 
        System.out.println(" _______\r\n" + //
                        "|       |\r\n" + //
                        "|       |\r\n" + //
                        "|       |  _\r\n" + //
                        "|_______| |_|");
        System.out.println("Calculating square area...");
        System.out.print("PLease enter side distance of your square = ");
        float side = scan.nextFloat();
        double Square = side * side;
        System.out.println("A = " + side);
    }
}
