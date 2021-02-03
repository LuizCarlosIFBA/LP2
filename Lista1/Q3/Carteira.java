/**
 * Escreva a descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carteira
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   private int id;
   private char cpf[] = new char[9];
   private char tipo[] = new char[2];
   private int validade, expedicao;
   private int pontos = 0;
   private String situacao;
   
   //Get e Set
   public void setId(int Id){
       this.id = id;
   }
   
   public void setCpf(char cpf[]){
       this.cpf = cpf;
   }
   
   public void setTipo(char tipo[]){
       this.tipo = tipo;
   }
      
   public void setValidade(int validade){
       this.validade = validade;
   }
      
   public void setExpedicao(char expedicao){
       this.expedicao = expedicao;
   }
   
   public void setPontos(int pontos){
       this.pontos = pontos;
   }
      
   public void setSituacao(String situacao){
       this.situacao = situacao;
   }
     
   public int getId(){
       return this.id;
   }
   
   public char getCpf(){
       return this.cpf[9];
   }
   
   public char getTipo(){
       return this.tipo[2];
   }
      
   public int getValidade(){
       return this.validade;
   }
      
   public char getExpedicao(){
       return this.expedicao;
   }
   
   public int getPontos(){
       return this.pontos;
   }
      
   public String getSituacao(){
       return this.situacao;
   }
   //
   
   //Criar carteira
   public Carteira(int id, char cpf, char tipo, int validade, int expedicao)
   {
        this.id = id;
        this.cpf = cpf;
        this.tipo = tipo;
        this.validade = validade;
        this.situacao = "Valida";
        this.expedicao = expedicao;
   }
      
   public int acrescentarPontos(int pts)
   {   
       return this.pontos = pontos + pts;
       //if(this.pontos > 20)System.out.println("Apreendida");       
   }
   
   public int consultarSaldo(){
       return pontos;
   }
       
   public void zerarSaldo(){
      this.pontos = 0;
   }
  
   public boolean apreenderCarteira(){
        if(this.pontos > 20)
           return true;
        else return false;   
   }
    
   public String verificarValidade(int anoAtual){ 
       if((anoAtual - expedicao)>validade)
                this.situacao = "Invalida";
       return situacao;  
   }
}

