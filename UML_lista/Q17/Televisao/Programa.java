
/**
 * Escreva uma descrição da classe Programas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Programa
{
    private int duracao;
    private String titulo; 
    private Patrocinador patrocinador;
    private float custo;
    
    public abstract float calcularCusto();
}
