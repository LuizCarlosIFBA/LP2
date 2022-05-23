
/**
 * Escreva uma descrição da classe Paciente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Paciente extends Pessoa
{
    private int cpf, telefone;
    private String endereco;
    
    public Paciente(int cpf, int telefone, String nome, String endereco){
        super(nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
