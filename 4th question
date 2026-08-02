import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the principal amount (starting money): ");
        double principal = reader.nextDouble();
        
        System.out.print("Enter the annual interest rate (like 5.5): ");
        double rate = reader.nextDouble();
        
        System.out.print("Enter the time in years: ");
        double time = reader.nextDouble();
        
        double simpleInterest = principal * rate * time / 100.0;
        double finalAmount = principal + simpleInterest;
    
        System.out.println("\n--- Results ---");
        System.out.println("Interest earned: " + simpleInterest);
        System.out.println("Total final amount: " + finalAmount);

        reader.close();
    }
}
