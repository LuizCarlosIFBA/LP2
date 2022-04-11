
/**
 * Escreva uma descrição da classe Laboratorio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Laboratorio {
    private String cnpj;
    private String nome;
    private String email;
    private String telefone;
    private double percentualLucro;

    public double getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(double percentualLucro) {
        this.percentualLucro = percentualLucro;
    } 

    public Laboratorio(String cnpj, String nome, String email, String telefone, double percentualLucro){
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.percentualLucro = percentualLucro;
    }
    
}

