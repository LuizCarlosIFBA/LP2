
/**
 * Escreva a descrição da classe Livro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Livro
{
    private String nome;
    private String autor;
    private double preco;
    private int edicao;
    private int ano;

    //get e set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    
    public void setEdicao(int edicao){
        this.edicao = edicao;
    }
    
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
     public String getNome(){
       return this.nome;
    }
    
    
    public String getAutor(){
        return this.autor;
    }
    
    
    public double getPreco(){
        return this.preco;
    }
    
    
    public double getEdicao(){
        return this.edicao;
    }
    
    
    public void nomeSet(String nome){
        this.nome = nome;
    }
    //
    public double livro(double per)
    {
        return preco * per;
    }
    
    public Livro( String nome, String autor, double preco, int edicao, int ano)
    {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.edicao = edicao;
        this.ano = ano;
    }


    public String imprimir(){
        return " "+livro(1.9)+" "+getAutor()+" "+getEdicao()+" "+getNome()+" "+getPreco();
    }    
}
