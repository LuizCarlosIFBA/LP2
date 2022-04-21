
/**
 * Escreva uma descrição da classe Modalidade aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Modalidade
{
    private float preco;
    private String nome;
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modalidade(float preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }
    
    /**
       Criar um metodo para calcular mensalidade
       */
}
