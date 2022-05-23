
/**
 * Escreva uma descrição da classe Consulta_convenio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Consulta_convenio extends Consulta
{
    private Convenio convenio;
    
    public Consulta_convenio(Medico medico, Paciente paciente, 
        String data, String problema, String diagnostico, Convenio convenio)
    {
        super(medico, paciente, data, problema, diagnostico);
        this.convenio = convenio;
    }
    
    public float CalcValor(){
        return this.convenio.getValor();
    }
}
