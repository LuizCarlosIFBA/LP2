
/**
 * Escreva uma descrição da classe AutomovelCarga aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AutomovelCarga extends Automovel
{
  private int pesoMaximo;
  
  public float getPesoMaximo() {
    return pesoMaximo;
  }

  public void setPesoMaximo(int pesoMaximo) {
      this.pesoMaximo = pesoMaximo;
  }
  
  public AutomovelCarga(String placa, int ano, int peso){
      super(placa, ano);
      this.pesoMaximo = pesoMaximo;
  }
  
  public float valorPassagem(){
     return 2*pesoMaximo;
  }
}
