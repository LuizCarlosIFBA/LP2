
/**
 * Escreva uma descrição da classe ConsultaParticular aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConsultaParticular extends Consultas
{   
    private float valorFixo = 100;
 
    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }
  
    public ConsultaParticular(Medico nome, String data, String problema, String diagnostico) {
        super(nome,data,problema,diagnostico);
    }
    
    public float calcularConsulta(){
        return getMedico().getValorConsulta();
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor "+this.calcularConsulta() );
    }
}
