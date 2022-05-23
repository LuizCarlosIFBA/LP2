import java.util.ArrayList; // import the ArrayList class
/**
 * Escreva uma descrição da classe ConsultaConvenio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConsultaConvenio extends Consultas
{   
    private String nomeConvenio;
    private float valorConsulta;
    private Convenio convenios;
    
    ArrayList<ConsultaConvenio> convenio = new ArrayList<ConsultaConvenio>();


    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNome(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsula(float valorConsula) {
        this.valorConsulta = valorConsula;
    }

    public ConsultaConvenio(String nomeConvenio, float valorConsula,Medico nome, String data, String problema, String diagnostico){
        super(nome,data,problema,diagnostico);
        this.nomeConvenio = nomeConvenio;
        this.valorConsulta = valorConsula;
    }
   
    
    public ConsultaConvenio(Medico nome, String data, String problema, String diagnostico) {
        super(nome,data,problema,diagnostico);
    }
    
    
    public boolean escolherConvenio(ConsultaConvenio convenios) {
        boolean resultado=false;
        for(int i = 0;i<convenio.size();i++){
            if(convenio.get(i).equals(convenios)){
                resultado = true;
                break;
            }else resultado = false;
        }
        return resultado;
    }

    public void registrarConvenio(ConsultaConvenio convenios) {
        convenio.add(convenios);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor "+this.convenios.getValor() );
    }
}
