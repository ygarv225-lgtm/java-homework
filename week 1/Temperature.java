import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Test Cases");
        
        double test1 = 0.0;
        double result1 = test1 * 9.0 / 5.0 + 32.0;
        System.out.println(test1 + " Celsius -> " + result1 + " Fahrenheit");
        
        double test2 = 25.0;
        double result2 = test2 * 9.0 / 5.0 + 32.0;
        System.out.println(test2 + " Celsius -> " + result2 + " Fahrenheit");
        
        double test3 = 100.0;
        double result3 = test3 * 9.0 / 5.0 + 32.0;
        System.out.println(test3 + " Celsius -> " + result3 + " Fahrenheit");
        
        System.out.println("-----------------\n");
        
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
    
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
        
        input.close();
    }
}