
/**
 * Escreva uma descrição da classe AutomovelPasseio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AutomovelPasseio extends Automovel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private int qtdPessoas;

   public int getQtdPesssoas() {
       return qtdPessoas;
   }

    public void setQtdPessoas(int qtdPesssoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public AutomovelPasseio(String placa, int ano, int qtdPessoas){
        super (placa, ano);
        this.qtdPessoas = qtdPessoas;
    }

    public float valorPassagem(){
        return 5*qtdPessoas;
    }
}
