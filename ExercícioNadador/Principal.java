import java.util.Scanner;

/**
 * @author Nicolas Jardin e Gustavo James
 * @version 1.0
 * @since 01/06/2020 - 10:07
 */
public class Principal {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        Nadador nadador = new Nadador();
        
        System.out.println("\fDigite o nome do nadador: ");
        nadador.setNome(scanner.nextLine());
        System.out.println("Digite a idade do nadador: ");
        nadador.setIdade(scanner.nextInt());
        System.out.println(nadador);
    }
}