
/**
 * Escreva uma descrição da classe Artigos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Artigo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Pesquisador pesquisador;
    private String resumo;
    private int qtdPaginas;
    
    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas=qtdPaginas;
    }
    
    public int getQtdPaginas(){
        return this.qtdPaginas;
    }
    
    public int calcularQtdArtigo(){
        return 0;
    }
}
