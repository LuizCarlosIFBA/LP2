
/**
 * Escreva uma descrição da classe Sala3d aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Sala3d extends Sala
{
    private String nomeEquipamento;

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public Sala3d(int numero, int capacidade, String nomeEquipamento) {
        super(numero,capacidade);
        this.nomeEquipamento = nomeEquipamento;
    }
}
