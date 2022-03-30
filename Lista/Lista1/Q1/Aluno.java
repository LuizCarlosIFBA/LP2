
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
    String matricula;
    String nome;
    int anoIngresso;
    String curso;
    int qtdDisciplinasMatriculadas;
    boolean situacaoAluno;
    
  
    void criarAluno(String matricula, String nome,int anoIngresso, String curso)
    {
        // inicializa variáveis de instância
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
      
    }
   
    int calcularPermanencia(int anoAtual){
        return anoAtual - this.anoIngresso;   
    }
    
    float calcularMensalidade(){
         //como o problema nao especificou deixei 100 reais para todos os cursos
         return 150*qtdDisciplinasMatriculadas;  
    }
}
