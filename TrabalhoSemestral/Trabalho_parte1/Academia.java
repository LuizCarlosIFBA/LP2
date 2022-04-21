
/**
 * Escreva uma descrição da classe Academia aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Academia
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private Modalidade esporte;

    public Modalidade getEsporte() {
        return esporte;
    }

    public void setEsporte(Modalidade esporte) {
        this.esporte = esporte;
    }

    public Academia(Modalidade esporte) {
        this.esporte = esporte;
    }
}
