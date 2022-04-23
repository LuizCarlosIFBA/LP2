import java.util.ArrayList;
/**
 * Escreva uma descrição da classe Sala aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Sala
{
    private int numero;
    private int capacidade;
    ArrayList<Sala> salas = new ArrayList();    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Sala(){
    
    }
    
    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }
        
    public void gravar(Sala sala) {
           salas.add(sala);
    }
}
