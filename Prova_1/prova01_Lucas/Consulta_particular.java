
/**
 * Escreva uma descrição da classe Particular aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Consulta_particular extends Consulta
{
    
    public Consulta_particular(Medico medico,Paciente paciente, 
        String data, String problema, String diagnostico)
    {
        super(medico, paciente, data, problema, diagnostico);
    }
    
    public float CalcValor(){
        return super.getMedico().getValorConsulta();
    }
}
