
/**
 * Escreva uma descrição da classe Paciente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class Paciente extends Pessoa
{  

    public Paciente(String cpf, String nome, String endereco, String telefone){
        super(cpf,nome,endereco,telefone);
    }
    
    public void gravarPessoa(Pessoa paciente) {
        pessoas.add(paciente);
    }
}
