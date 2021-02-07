
/**
 * Escreva a descrição da classe Restaurante aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Restaurante
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double pesoConsumido;
    private int qtdBebida;
    private double pesoSobremesa; 

    public void setPesoConsumido (double pesoConsumido){
        this.pesoConsumido = pesoConsumido;
    }
    
    public void setQtdBebida (int qtdBebida){
        this.qtdBebida = qtdBebida;
    }
    
    public void setPesoSobremesa (double pesoSobremesa){
        this.pesoSobremesa = pesoSobremesa;
    }
    
    public double getPesoConsumido (){
        return this.pesoConsumido;
    }
    
    public int getQtdBebida (){
        return this.qtdBebida;
    }
    
    public double getPesoSobremesa(){
        return this.pesoSobremesa;
    }
       
    public void criarComanda(double pesoConsumido, int qtdBebida, double pesoSobremesa)
    {
        this.pesoConsumido = pesoConsumido;
        this.qtdBebida = qtdBebida;
        this.pesoSobremesa = pesoSobremesa;
    }
        
    public double calcularComanda()
    {
        return (2*getQtdBebida())+(getPesoSobremesa()*50)+(getPesoSobremesa()*40);
    }
    
}
