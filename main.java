
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.print("1. Area calculator");
        System.out.print("2. Equation calculator");
        System.out.print("3. Volume calculator");
        System.err.print("Enter your choice: ");
        String choice  = scan.nextLine();
        if (choice == 1 || choice ==  "1") {
            squuare_Area();            
        } else{
            System.out.print("invied");
        }
    }
}