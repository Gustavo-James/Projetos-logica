import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    
    System.out.println("\f");    
        
    Multiplication multiplication = new Multiplication();
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Type number 1:");
    multiplication.setNumber1(scanner.nextDouble());
    System.out.println("Type number 2:");
    multiplication.setNumber2(scanner.nextDouble());
    System.out.println("Type number 3:");
    multiplication.setNumber3(scanner.nextDouble());
    
    System.out.println(multiplication);
    
    }
}