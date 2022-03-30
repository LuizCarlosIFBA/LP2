
/**
 * Escreva uma descrição da classe livrosLoja aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class livrosLoja
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String nome;
    String autor;
    double custo;
    int edicao;
    int ano;

    void criarLivro(String nome, String autor, double custo, int edicao, int ano)
    {
        this.nome=nome;
        this.autor=autor;
        this.custo = custo;
        this.edicao = edicao;
        this.ano=ano;
    }
    
    //per e o valor percentual
    double precoVenda(double per){
        return this.custo*per;
    }
    
    void imprimir()
    {
        System.out.println(nome);
        System.out.println(autor);
        System.out.println(custo);
        System.out.println(edicao);
        System.out.println(ano);
    }

}
