
public class Produto {
    
    private String codigo;
    private String nomeProduto;
    private String categoria;
    private boolean perecivel = false;
    private float precoVenda;

    public Produto(String codigo, String nomeProduto, String categoria, float precoVenda, boolean perecivel) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.precoVenda = precoVenda;
        this.perecivel = perecivel;
    }

    public Produto() {
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public float calculaPrecoVenda(float valor){
        return valor * 1.25f;
    }
 
    
}
