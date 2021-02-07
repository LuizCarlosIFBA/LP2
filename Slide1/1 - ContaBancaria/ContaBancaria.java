
/**
 * Escreva a descrição da classe ContaBancaria aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ContaBancaria
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private char cpf[] = new char[11];
    private String nome;
    private double saldo;
    
    public void setCpf(char cpf){
        this.cpf[11] = cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public char getCpf(){
        return cpf[11];
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public ContaBancaria(char cpf,String nome,double saldo)
    {
        this.cpf[11] = cpf; 
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor)
    {
        this.saldo = saldo + valor;
    }
    
    public void saque(double valor){
        if(getSaldo()>0){
            if(valor>saldo){
                System.out.println("Saldo insuficiente para a operaçao");
                System.out.println("Saldo atual: "+getSaldo());
            }else this.saldo=saldo - valor; 
        }
    }
    
    public double consultar()
    {
        return getSaldo();
    }
}
