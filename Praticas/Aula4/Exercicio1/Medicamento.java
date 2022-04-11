
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
    private float custo;
    private Laboratorio fabricante;

   
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
    
    public void setPrincipioAtivo(String principioAtivo){
        this.principioAtivo=principioAtivo;
    }
    
    public void setCusto(float custo){
        this.custo = custo;
    }

    
    /**
     * Construtor para objetos da classe Medicamento
     */
    public Medicamento(String nome, String pincipioAtivo, float custo, Laboratorio fabricante)
    {
       this.nome = nome;
       this.principioAtivo = principioAtivo;
       this.custo = custo;
       this.fabricante = fabricante; 
    }
    
    public Medicamento(String nome, float custo,Laboratorio fabricante)
    {
       this(nome, nome, custo,fabricante);
    }

    public float precoVenda(float lucro){
        float preco=0;
        preco = this.custo + this.custo*lucro/100;
        return preco;        
    }
    
    public double precoVenda(){
        return this.precoVenda(30);     
    }

    public boolean substituir(Medicamento x){
        if(this.principioAtivo.equals(x.getPrincipioAtivo())){
            return true;
        }else return false;             
    } 

   
}
