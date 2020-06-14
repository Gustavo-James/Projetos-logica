public class Produto {
    
    String descricao;
    String fornecedor;
    double preco;
    int quantidade;
    double porcentagem;
    
    public double calcularPreco() {
        return quantidade * preco;
    }
    
    public double adicionar65PorCento() {
        return calcularPreco() * 1.65;
    }
    
}