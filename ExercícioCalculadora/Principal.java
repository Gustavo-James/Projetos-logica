public class Principal{
    public static void main(String args[]) {
        
    Calculadora calculadora = new Calculadora();
    
    calculadora.numero1 = 5;
    calculadora.numero2 = 5;
    
    System.out.println("\f");
    System.out.println("Número 1:" + calculadora.numero1);
    System.out.println("Número 2:" + calculadora.numero2);
    System.out.println("Resultado da soma:" + calculadora.calcularSoma());
    System.out.println("Resultado da subtração:" + calculadora.calcularSubtracao());
    System.out.println("Resultado da divisão:" + calculadora.calcularDivisao());
    System.out.println("Resultado da multiplicação:" + calculadora.calcularMultiplicacao());
  
    }
}