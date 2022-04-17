
/**
 * Escreva uma descrição da classe Conta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Conta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cpf, nomeCorrentista;
    private float saldo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Construtor para objetos da classe Conta
     */
    public void depositar(float dinheiro)
    {
        this.saldo = saldo + dinheiro;   
    }
    
    /*Se tiver saldo saca, se não tiver retorna zero*/
    public float sacar(float dinheiro)
    {
        if(getSaldo()>0 && getSaldo()>=dinheiro){
            this.saldo = saldo - dinheiro;
            return dinheiro;    
        }else return 0;        
    }
    
    public void consultar(){
        System.out.println("CPF: "+getCpf());
        System.out.println("Nome do correntista:"+nomeCorrentista);
        System.out.println("Saldo: "+getSaldo());
    }

}
