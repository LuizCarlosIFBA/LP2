
/**
 * Escreva uma descrição da classe Contrato aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Contrato
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private String cpfCnpj, nome, email, telefone, endereco;
   private Automovel[] meuAuto = new Automovel[10];

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        this.endereco = endereco;
   }
   
   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
   }
   
   public String getCpfCnpj(){
        return cpfCnpj;
   }

   public void setCpfCnpj(String cpfCnpj){
        this.cpfCnpj = cpfCnpj;
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
   
   public Contrato(String cpfCnpj, String nome, String email, String telefone){
       this.cpfCnpj = cpfCnpj;
       this.nome = nome;
       this.email = email;
       this.telefone = telefone;
  }
    
   /**Metodo que registar automovel*/
   public void gravarAutomovel(Automovel carro){
        for(int i=0;i<10;i++){
            if(meuAuto[i]==null){
                meuAuto[i]= carro;
                break;
            }
        }
   }
   

}
