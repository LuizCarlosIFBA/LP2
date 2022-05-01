
/**
 * Escreva uma descrição da classe Pedagio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pedagio
{
    private String nome, site;
    private int qtdRegistro;
    private Contrato[] meusCarros = new Contrato[100];
  
    public int getQtdRegistro() {
        return qtdRegistro;
    }

    public void setQtdRegistro(int qtdRegistro) {
        this.qtdRegistro = qtdRegistro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    public Pedagio(String nome, String site)
    {
        this.nome = nome;
        this.site = site;
    }
    
    /**Grava veiculos */
    public void gravarCarros(Contrato carros){
        for(int i=0;i<10;i++){
            if(meusCarros[i]==null){
                meusCarros[i]= carros;
                break;
            }
        }     
    }
    
    /**Quantidade de viagens*/
    public void contarRegistro(Contrato carros){
        for(int i=0;i<10;i++){
            if(carros.equals(meusCarros[i])){
                this.qtdRegistro++;
            }
        }
    }
}
