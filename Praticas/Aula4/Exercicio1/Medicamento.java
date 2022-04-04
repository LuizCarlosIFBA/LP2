import java.util.List;
import java.util.ArrayList;
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
    
    public void setPrincipioAtivo(String principioAtivo){
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

    public double precoVenda(){
        return this.custo*1.3;        
    }

    public String substituir(Medicamento m1, Medicamento m2){
        if(m1.getPrincipioAtivo()==m2.getPrincipioAtivo()){
            return "Podem ser substituidos";
        }else return "Não podem ser substituidos";             
    } 

    public static void main(String args[]){
        Laboratorio l = Laboratorio("121212121","Laboratorio Globo","lab@globo.com","9999999999999",1.3);
        System.out.println("O laboratorio que fabrica o medicamento  e "+l.nome);
        l.getPercentualLucro();
              
        m1.criarMedicamento("Dorilax","paracetamol",1000);
        m2.criarMedicamento("Cimegripe","paracetamol",1000);
        System.out.println(substituir(m1,m2));
       

                                
    }
}
