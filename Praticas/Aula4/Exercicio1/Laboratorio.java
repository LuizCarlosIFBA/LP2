public class Laboratorio {
    private String cnpj;
    private String nome;
    private String email;
    private char telefone[] = new char[13];
    private double percentualLucro;

    public double getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(double percentualLucro) {
        this.percentualLucro = percentualLucro;
    } 

    public Laboratorio(String cnpj, String nome, String email, char telefone[], double percentualLucro){
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone[13] = telefone[13];
        this.percentualLucro = percentualLucro;
    }
    
}
