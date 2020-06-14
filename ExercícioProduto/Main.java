import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    
    Produto produto = new Produto();    
    Scanner scanner = new Scanner(System.in);
 
    System.out.print("\f");
    System.out.println("Digite a descrição do produto:");
    produto.descricao = scanner.next();
    System.out.println("Digite o fornecedor do produto:");
    produto.fornecedor = scanner.next();
    System.out.println("Digite o preço por unidade do produto:");
    produto.preco = scanner.nextDouble();
    System.out.println("Digite a quantidade de produtos:");
    produto.quantidade = scanner.nextInt();
    System.out.println("Digite a porcentagem a ser calculada");
    produto.porcentagem = scanner.nextDouble();
    
    System.out.println("Preço final:" + produto.calcularPreco());
    System.out.println("Preço com 65% de juros:" + produto.adicionar65PorCento());
  
    }
}