/**
 * Escreva uma descrição da classe Curso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Curso
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int codigo;
    private String nome;
    private String nomeFaculdade;
    private int duracao;
    private double valorTotal;
    private int anoCriacao;
    private int anoCriacaoFaculdade;
    
    public int getAnoCriacaoFaculdade(){
        return anoCriacaoFaculdade;
    }
    
    public String getNomeFaculdade(){
        return nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public int getAnoCriacao(){
        return anoCriacao;
    }
    
    public void setAnoCriacaoFaculdade(int anoCriacaoFaculdade){
        this.anoCriacaoFaculdade=anoCriacaoFaculdade;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
    
    public void setValorTotal(double valorTotal){
        this.valorTotal=valorTotal;
    }
    
    public void setAnoCriacao(int anoCriacao){
        this.anoCriacao=anoCriacao;
    }
    
    public void setNomeFaculdade(String nomeFaculdade){
        this.nomeFaculdade=nomeFaculdade;
    }
        
    public Curso(int codigo, String nome, double valorTotal, int anoCriacao){
        this.codigo=codigo;
        this.nome=nome;
        this.duracao=8;
        this.valorTotal=valorTotal;
        this.anoCriacao=anoCriacao;
    }
    
    public Curso(int codigo, String nome, double valorTotal, int anoCriacao, int duracao){
       this(codigo,nome,valorTotal,anoCriacao);
       this.duracao = duracao;
    }
    
    public Curso(int codigo, String nome, double valorTotal, int anoCriacao, int duracao, String nomeFaculdade){
       this(codigo,nome,valorTotal,anoCriacao,duracao);
       this.nomeFaculdade = nomeFaculdade;
    }
    
    public double calcularValorCurso(){
        return this.valorTotal/(this.duracao*6);
    }
}