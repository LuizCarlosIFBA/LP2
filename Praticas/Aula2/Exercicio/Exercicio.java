
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
    private int matricula;
    private String nome;
    private int anoIngresso;
    private String curso;
    private boolean matriculado;
    private int disciplinasMatriculadas;

    /*Get*/
    public String getNome(){ 
        return nome;
    }

    public int getMatricula(){ 
        return matricula;
    }

    public int getAnoIngresso(){ 
        return anoIngresso;
    }

    public String getCurso(){ 
        return curso;
    }

    public boolean getMatriculado(){ 
        return  matriculado;
    }

    /*Set*/
    public void setNome(String nome){ 
        this.nome = nome;
    }

    public void setMatricula(int matricula){ 
        this.matricula = matricula;
    }

    public void setAnoIngresso(int anoIngresso){ 
        this.anoIngresso=anoIngresso;
    }

    public void setCurso(String curso){ 
        this.curso=curso;
    }

    public void disciplinasMatriculadas(int disciplinasMatriculadas){ 
        this.disciplinasMatriculadas=disciplinasMatriculadas;
    } 

    /**
     * Construtor para objetos da classe Exercicio
     */
    public void criar(int matricula, String nome,int anoIngresso, String curso,boolean matriculado, int disciplinasMatriculadas)
    {
        // inicializa variáveis de instância
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.matriculado = matriculado;
        this.disciplinasMatriculadas = disciplinasMatriculadas; 
    }

   
    public void matricular(int disciplinasMatriculadas){
         this.disciplinasMatriculadas = disciplinasMatriculadas + 1;  
    }
    
    public void imprimir(){
        System.out.println(matricula);
        System.out.println(nome);
        System.out.println(anoIngresso);
        System.out.println(curso);
        System.out.println(matriculado);
        System.out.println(disciplinasMatriculadas); 
    }
    
    public int calcularPermanencia(int anoIngresso){
        Calendar cal = GregorianCalendar.getInstance();
        return cal.get(Calendar.YEAR) - anoIngresso;   
    }
    
    public float calcularMensalidade(){
         //como o problema nao especificou deixei 100 reais para todos os cursos
         return 100;  
    }
}
