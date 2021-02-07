
/**
 * Escreva a descrição da classe Quadrado aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Quadrado
{
    private double lado;

    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    public Quadrado(double lado)
    {
        this.lado = lado;
    }

    public double perimetro()
    {
        return 4 * lado;
    }
}
