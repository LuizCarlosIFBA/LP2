import java.util.Date;
import java.util.ArrayList; // import the ArrayList class

/**
 * Escreva uma descrição da classe SalaVip aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class SalaVip extends Sala{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    ArrayList<Date> horarios = new ArrayList<Date>();

    public ArrayList<Date> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Date> horarios) {
        this.horarios = horarios;
    }

    public SalaVip(int numero, int capacidade, Date horario) {
        super(numero,capacidade);
        horarios.add(horario);
    }
     
}
