
/**
 * Escreva uma descrição da classe Medico aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Medico extends Pessoa
{
    private String especialidade;
    private int crm;
    private float valorConsulta;
    private Consulta[] consultas = new Consulta[100];
    
    public Medico(String nome, String especialidade, int crm, float valorConsulta){
        super(nome);
        this.especialidade = especialidade;
        this.crm = crm;
        this.valorConsulta = valorConsulta;
    }
    
    public float CalcFaturamento(){
       float faturamento = 0;
       for(int i = 0; i < 100; i++){
           faturamento += this.consultas[i].CalcValor();
       }
       
       return faturamento;
   }
   
    public String getNome() {
        return super.getNome();
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public float getValorConsulta() {
        return this.valorConsulta;
    }
}
