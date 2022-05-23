import java.util.ArrayList; 
/**
 * Escreva uma descrição da classe Medico aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Medico extends Pessoa
{    
    private float valorConsulta;
    private String crm;
    private String especialidade;

    private ArrayList<Consultas> consulta = new ArrayList<Consultas>();

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    /**usar so o nome*/
    public Medico(String cpf, String nome, String endereco, String telefone,float valorConsulta, String  crm, String especialidade){
        super(cpf,nome,endereco,telefone);
        this.valorConsulta=valorConsulta;
        this.crm = crm;
        this.especialidade=especialidade;
    }
    
    public boolean substituirMedico(Medico medico) {
        if(medico.getEspecialidade().equals(this.getEspecialidade())){
            return true;
        }else return false;
    }
    
    public float CalcFaturamento(){
       float faturamento = 0;
       for(int i = 0; i < consulta.size(); i++){
           faturamento += this.consulta.get(i).calcularConsulta();
       }
       
       return faturamento;
   }
    
}
