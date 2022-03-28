
/**
 * Escreva uma descrição da classe Medicamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Medicamento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String principioAtivo;
    private double custo;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getPrincipioAtivo(){
        return this.principioAtivo;
    }
    
    public double getCusto(){
        return this.custo;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setPrincipioAtivo(String PrincipioAtivo){
        this.principioAtivo=principioAtivo;
    }
    
    public void setCusto(double custo){
        this.custo = custo;
    }

    /**
     * Construtor para objetos da classe Medicamento
     */
    public void criarMedicamento(String nome, String pincipioAtivo, double custo)
    {
       this.nome = nome;
       this.principioAtivo = principioAtivo;
       this.custo = custo;
    }
    
    public void criarMedicamento(String nome, double custo)
    {
       this.nome = nome;
       this.custo = custo;
    }

    public double precoVenda(double per){
        return this.custo*per;        
    }
    
    public double precoVenda(){
        return this.custo*1.3;        
    }
}
