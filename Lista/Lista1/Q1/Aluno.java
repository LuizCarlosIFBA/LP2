
/**
 * Escreva uma descrição da classe Exercicio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.io.*;
import java.util.*;


public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String matricula;
    private String nome;
    private int anoIngresso;
    private String curso;
    private int qtdDisciplinasMatriculadas;
    private boolean situacaoAluno;
    /*Get*/
    public boolean getSituacaoAluno(){ 
        return situacaoAluno;
    }

    public int getqtdDisciplinasMatriculadas(){ 
        return qtdDisciplinasMatriculadas;
    }
    
    public String getNome(){ 
        return nome;
    }

    public String getMatricula(){ 
        return matricula;
    }

    public int getAnoIngresso(){ 
        return anoIngresso;
    }

    public String getCurso(){ 
        return curso;
    }
    

    /*Set*/
    public void setSituacaoAluno(boolean situacaoAluno){ 
        this.situacaoAluno=situacaoAluno;
    }

    public void setqtdDisciplinasMatriculadas(int qtdDisciplinasMatriculadas){ 
        this.qtdDisciplinasMatriculadas=qtdDisciplinasMatriculadas;
    }    
    
    public void setNome(String nome){ 
        this.nome = nome;
    }

    public void setMatriculado(String matriculado){ 
        this.matricula = matricula;
    }

    public void setAnoIngresso(int anoIngresso){ 
        this.anoIngresso=anoIngresso;
    }

    public void setCurso(String curso){ 
        this.curso=curso;
    }


    /**
     * Construtor para objetos da classe Exercicio
     */
    public void criarAluno(String matricula, String nome,int anoIngresso, String curso)
    {
        // inicializa variáveis de instância
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
      
    }

   
    /*public void matricular(int disciplinasMatriculadas){
         this.qtdDisciplinasMatriculadas  = qtdDisciplinasMatriculadas + 1;  
    }*/
    
    public void imprimir(){
        System.out.println(matricula);
        System.out.println(nome);
        System.out.println(anoIngresso);
        System.out.println(curso);
    
    }
    
    public int calcularPermanencia(int anoAtual){
        return anoAtual - anoIngresso;   
    }
    
    public float calcularMensalidade(){
         //como o problema nao especificou deixei 100 reais para todos os cursos
         return 150*getqtdDisciplinasMatriculadas();  
    }
}
