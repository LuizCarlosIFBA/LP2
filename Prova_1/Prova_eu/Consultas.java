/**
 * Escreva uma descrição da classe Consultas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Consultas
{   
    private Medico medico;    /**Esse e para puxar outros atributos nas classes filhas*/
    private String data, problema, diagnostico;
        

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Consultas(Medico medico, String data, String problema, String diagnostico) {
        this.medico = medico;
        this.data = data;
        this.problema = problema;
        this.diagnostico = diagnostico;
    }
 
    
    public float calcularConsulta(){
        return 0;
    }
    
    public void imprimir(){
        System.out.println("Medico: "+medico.getNome()+", data "+this.data+", problema"+this.problema+", Diagnostico"+this.diagnostico);
    }
    

}
