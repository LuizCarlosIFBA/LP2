
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Date;

public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cpf;
    private String nome;
    private String endereco;
    private String email;
    private String celular;
    private Date dataIngresso;
    private String cpfResponsavel;
    private String nomeResponsavel;
    private String telefoneResponsavel;
    private Academia academia;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
        
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
    
        public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public Aluno(String cpf, String nome, String endereco, String email, String celular, Date dataIngresso) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.dataIngresso = dataIngresso;
    }
    
    //Menor de idade
    public Aluno(String cpf, String nome, String endereco, String email, String celular, Date dataIngresso,String cpfResponsavel, String nomeResponsavel, String celularResponsavel) {
        this(cpf,nome,endereco,email,celular,dataIngresso);
        this.cpfResponsavel = cpfResponsavel;
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
    }
        
    /**
       *Para alunos menores de idade deve ser cadastrado também o cpf, nome e telefone do responsável.*/
    
  
}
