import java.util.ArrayList; // import the ArrayList class
/**
 * Escreva uma descrição da classe Consultas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Consultas
{   
    private Medico medico;    /**Ess e para puxar outros atributos nas classes filhas*/
    private Medico nome;
    private String data, problema, diagnostico;
       
    ArrayList<Consultas> consulta = new ArrayList<Consultas>();


    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public Medico getNome() {
        return nome;
    }

    public void setNome(Medico nome) {
        this.nome = nome;
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

    public Consultas(Medico nome, String data, String problema, String diagnostico) {
        this.nome = nome;
        this.data = data;
        this.problema = problema;
        this.diagnostico = diagnostico;
    }
 
    public void gravarConsulta(Consultas consultas) {
        consulta.add(consultas);
    }
    
    public float calcularConsulta(){
        return 0;
    }
    
    public void imprimir(){
        System.out.println("Medico: "+medico.getNome()+", data "+this.data+", problema"+this.problema+", Diagnostico"+this.diagnostico);
    }
    

}
