
/**
 * Escreva uma descrição da classe Automovel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Automovel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Passagem passagem;
    private String placa;
    private int anoFabricacao;
    private Passagem[] gastos = new Passagem[100];
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Automovel(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }
    
    public void addPassagem(Passagem p){
        for (int i=0;i<100; i++)
           if (gastos[i]==null){
               gastos[i] = p;
               break;
            }
    }
    
    public float valorPassagem(){
        return 0;
    }
}
