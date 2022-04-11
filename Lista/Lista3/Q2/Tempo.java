
/**
 * Escreva uma descrição da classe Tempo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tempo {
    private int hora, minuto, segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public float converterMinuto(int hora, int minuto, int segundo) {
        return (hora*60)+minuto+(segundo/60);
    }
    
}

