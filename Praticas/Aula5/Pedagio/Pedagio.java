
/**
 * Escreva uma descrição da classe Pedagio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pedagio
{
    private String nome, site;
    private Contrato[] meusContratos = new Contrato[100];
   
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
}
