
/**
 * Escreva uma descrição da classe livrosLoja aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class livrosLoja
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String autor;
    private double custo;
    private int edicao;
    private int ano;

    /*Get*/
    public String getNome(){ 
        return this.nome;
    }

    public String getAutor(){ 
        return this.autor;
    }
    
    public double getCusto(){ 
        return this.custo;
    }

    public int getEdicao(){ 
        return this.edicao;
    }

    public int getAno(){ 
        return this.ano;
    }

    /*Set*/
    public void setNome(String nome){ 
        this.nome=nome;
    }

    public void setAutor(String autor){ 
        this.autor=autor;
    }    
    
    public void setCusto(double custo){ 
        this.custo = custo;
    }

    public void setEdicao(int edicao){ 
        this.edicao = edicao;
    }

    public void setAno(int ano){ 
        this.ano=ano;
    }
    
    /**
     * Construtor para objetos da classe livrosLoja
     */
    public void criarLivro(String nome, String autor, double custo, int edicao, int ano)
    {
        this.nome=nome;
        this.autor=autor;
        this.custo = custo;
        this.edicao = edicao;
        this.ano=ano;
    }
    
    //per e o valor percentual
    public double precoVenda(double per){
        return this.custo*per;
    }
    
    public void imprimir()
    {
        System.out.println(nome);
        System.out.println(autor);
        System.out.println(custo);
        System.out.println(edicao);
        System.out.println(ano);
    }

}
