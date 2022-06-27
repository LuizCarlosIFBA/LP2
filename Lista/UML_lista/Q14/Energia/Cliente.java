
/**
 * Escreva uma descrição da classe Clientes aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Cliente
{
    private int numeroContrato, mes, ano;
    private String endereco;
    private float consumo;
    
    public abstract float calcularConsumo();
    public abstract float arrecadacaoTotal();
}
