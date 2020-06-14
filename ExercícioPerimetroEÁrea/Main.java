import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

    System.out.println("\f");    
    
    PerimeterAndArea perimeterAndArea = new PerimeterAndArea();
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Type the width:");
    perimeterAndArea.setWidth(scanner.nextDouble());
    System.out.println("Type the length:");
    perimeterAndArea.setLength(scanner.nextDouble());
    
    System.out.println(perimeterAndArea);
    
    }
}