import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan_area = new Scanner(System.in);
        System.out.println("1. Area calculator");
        System.out.println("2. Equation calculator");
        System.out.println("3. Volume calculator");
        System.out.print("Enter your choice: ");
        
        String choice = scan.nextLine();
        
        if (choice.equals(1) || choice.equals("1")) {
            System.out.println("Welcome To Area calculator");
            System.out.println("1. Square");
            System.out.println("chose what shape do you want to calculate....");
            int areaChoice = scan.nextInt(); 
            switch(areaChoice){
                case 1:
                AreaCalculator.squuare_Area();
                break;
                default:
                System.out.println("wrong");
            }
        } else {
        }
        
    }
}