
/**
 * Escreva uma descrição da classe Contrato aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Contrato
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private String cpf, nome, email;
   private Automovel[] meuAuto = new Automovel[10];

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Automovel[] getMeuAuto() {
        return meuAuto;
    }

    public void setMeuAuto(Automovel[] meuAuto) {
        this.meuAuto = meuAuto;
    }
   
   public Contrato(String cpf, String nome, String email){
       this.cpf = cpf;
       this.nome = nome;
       this.email = email;
    }
}
