
/**
 * Escreva uma descrição da classe Consulta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Consulta
{
    private Medico medico;
    private Paciente paciente;
    private String data, problema, diagnostico;
    
    public Consulta(Medico medico,Paciente paciente, String data, String problema, String diagnostico){
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.problema = problema;
        this.diagnostico = diagnostico;
    }
    
    public float CalcValor(){
        return 0;
    }
    
     public boolean SubstituiMedico(Medico medicoB){    
       return this.medico.getEspecialidade().equals(medicoB.getEspecialidade());
   }
   
    public Medico getMedico () {
        return this.medico;
    }
    
    public void imprimir(){
        System.out.println("DADOS DA CONSULTA:");
        System.out.println("medico:"+this.medico.getNome());
        System.out.println("data da consulta:"+this.data);
        System.out.println("problema relatado:"+this.problema);
        System.out.println("diagnostico do medico:"+this.diagnostico);
        System.out.println("valor da consulta:"+CalcValor());
    }
}
