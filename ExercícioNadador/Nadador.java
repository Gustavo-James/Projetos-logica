/**
 * @author Nicolas Jardin e Gustavo James
 * @version 1.0
 * @since 01/06/2020 - 9:47
 */
public class Nadador {
    
    private String nome;
    private int idade;

    public nadador() {
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return Retorna a categoria do nadador.
     */
    public String classificarCategoria() {
        if(this.idade > 0 && this.idade < 8) {
            return "Não pode ser nadador. mínimo oito anos.";
        } else if(this.idade >= 8 && this.idade <= 10) {
            return "Infantil";
        } else if(this.idade >= 11 && this.idade <= 17 ) {
            return "Juvenil";
        } else if(this.idade >= 18 && this.idade <= 127) {
            return "Adulto";
        }
        return "Idade inválida";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nClassificação: " + this.classificarCategoria();
    }
}