
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
    private int duracao;
    private double valorTotal;
    private int anoCriacao;
    
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
    
    public void criarCurso(int codigo, String nome, int duracao, double valorTotal, int anoCriacao){
        this.codigo=codigo;
        this.nome=nome;
        this.duracao=duracao;
        this.valorTotal=valorTotal;
        this.anoCriacao=anoCriacao;
    }
    
    public void criarCurso(int codigo, String nome, double valorTotal, int anoCriacao){
        this.codigo=codigo;
        this.nome=nome;
        this.duracao=8;
        this.valorTotal=valorTotal;
        this.anoCriacao=anoCriacao;
    }
    
    public double calcularMensalidade(){
        return this.valorTotal/(this.duracao*6);
    }
}
