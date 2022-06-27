
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Produto
{
    private String nome, fornecedor;
    private int qtdEstoque;
    private float preco;
    private Venda venda;
    private NotaFiscal notafiscal;

    public abstract float calcularPrecoVenda();
}
