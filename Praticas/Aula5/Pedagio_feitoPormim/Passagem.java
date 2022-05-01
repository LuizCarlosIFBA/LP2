
/**
 * Escreva uma descrição da classe Passagem aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Passagem
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Data horario;
    
    public Passagem(Data horario)
    {
        this.horario = horario;
    }
    
    public Data getHorario(){
        return this.horario;
    }
    
    public void setPassagem(Data horario){
        this.horario = horario;
    }
}
