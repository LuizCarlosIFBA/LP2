
/**
 * Escreva uma descrição da classe AutomovelPequeno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AutomovelPequeno extends Automovel
{
  private String modelo;
  
  public String getModelo() {
      return modelo;
  }

  public void setModelo(String modelo) {
      this.modelo = modelo;
  }
  
  public AutomovelPequeno(String placa, int ano, String modelo){
     super(placa,ano);
     this.modelo = modelo;
  }
  
  public float valorPassagem(){
     return 6;
  }
}
