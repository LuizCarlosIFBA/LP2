
/**
 * Escreva uma descrição da classe EncomendaSedex aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class EncomendaSedex extends Encomenda
{
  Encomenda encomenda;
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
  public EncomendaSedex(String data, Pessoa emitente, Pessoa destinatario, float peso){
       super(data,emitente,destinatario,peso);
  }
   
  public float calcTaxa(){
    return super.calcTaxa()*1.3f;
  }  
}
