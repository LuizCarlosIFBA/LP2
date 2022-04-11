/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Luiz) 
 * @version (2022.1)
 */
public class Loja
{
    String nomeFantasia, razSocial;
    String cnpj, digitoCnpj;
    float faturamento, area;
    
     public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazSocial() {
        return razSocial;
    }

    public void setRazSocial(String razSocial) {
        this.razSocial = razSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDigitoCnpj() {
        return digitoCnpj;
    }

    public void setDigitoCnpj(String digitoCnpj) {
        this.digitoCnpj = digitoCnpj;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    

    public Loja(String nomeFantasia, String razSocial, String cnpj, String digitoCnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razSocial = razSocial;
        this.cnpj = cnpj;
        this.digitoCnpj = digitoCnpj;
    }

    public Loja(String nomeFantasia, String cnpj, String digitoCnpj, float faturamento, String pubAlvo) {
        String publicoAlvo = pubAlvo;
        this.nomeFantasia = nomeFantasia;
        this.razSocial = nomeFantasia;
        this.cnpj = cnpj;
        this.digitoCnpj = digitoCnpj;
        this.faturamento = faturamento;
    }  

    public boolean maiorFat(Loja x) {
        if(this.faturamento > x.getFaturamento()){
        return true;
        } else return false; 
    }

    public float calcAluguel() {
        float valorMetro = 50.00f;
        float aluguel = this.area * valorMetro;
        return aluguel;
    }
}