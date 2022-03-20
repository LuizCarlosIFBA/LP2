/*Classe aluno 
    -> Matricula
    -> Nome 
    -> Ano Ingresso
    -> Curso 
    -> QTD
    -> */
public class Aluno {

  private String nome;
  private String matricula;
  private int anoIngresso;
  private String curso;   
  private int qtd;
  boolean String situacaoAluno;

  /*Get*/
  public String getNome(String nome){ 
    return nome;
  }

  public String getMatricula(String matricula){ 
    return matricula;
  }

  public int getAnoIngresso(int anoIngresso){ 
    return anoIngresso;
  }

  public String getCurso(String curso){ 
    return curso;
  }
  
  public int getQtd(String qtd){ 
    return qtd;
  }

  /*Set*/
  public void setNome(String nome){ 
    this.nome = nome;
  }

  public void setMatricula(String matricula){ 
    this.matricula = matricula;
  }

  public void setAnoIngresso(int anoIngresso){ 
    this.anoIngresso=anoIngresso;
  }

  public void setCurso(String curso){ 
    this.curso=curso;
  }
  
  public void setQtd(String qtd){ 
    this.qtd=qtd;
  }
}
