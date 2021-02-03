
/**
 * Escreva a descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int matricula;
    private int ano;
    private String curso;
    private int qtd;
    private boolean situacao;
    
    //Get e Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
        
    public void setAno(int ano){
        this.ano = ano;
    }
        
    public void setCurso(String curso){
        this.curso = curso;
    }
   
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    public void setSituacao(boolean situacao){
        this.situacao = situacao;
    }
    
    public String getNome(String nome){
        return this.nome;
    }
        
    public int getMatricula(int matricula){
        return this.matricula;
    }
        
    public int getAno(int ano){
        return this.ano;
    }
    
    public String getCurso(String curso){
        return this.curso;
    }
        
    public int getQtd(int qtd){
        return this.qtd;
    }
    
    public boolean getSituacao(boolean situacao){
        return this.situacao;
    }
    //
    
    
    public void criar(String nome, int matricula, int ano, String curso)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso; 
    }

    public double calcMensalidade(int qtd){
        return qtd*150;
    }
    
    public int calcTempo(int anoAtual, int anoIngresso){
        return anoAtual - anoIngresso; 
    }
    
}
