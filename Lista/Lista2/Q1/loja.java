
/**
 * Escreva uma descrição da classe loja aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class loja
{
    private String nomeFantasia, razaoSocial;
    private char numeroCNPJ[] = new char[12];
    private char digitoCNPJ[] = new char[2];
    private double valorFaturamento;
    private double area;
    private String publicoAlvo;
 
    public String getPublicoAlvo(){
        return this.publicoAlvo;
    }
    
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public char getNumeroCNPJ(){
        return this.numeroCNPJ[12];
    }
    
    public char getDigitoCNPJ(){
        return this.digitoCNPJ[2];
    }
    
    public double getValorFaturamento(){
        return this.valorFaturamento;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public String setNomeFantasia(String nomeFantasia){
        return this.nomeFantasia;
    }
    
    public String setRazaoSocial(String razaoSocial){
        return this.razaoSocial;
    }
    
    public void setPublicoAlvo(String publicoAlvo){
        this.publicoAlvo = publicoAlvo;
    }
    
    public void setNumeroCNPJ(char numeroCNPJ[]){
        this.numeroCNPJ[12]=numeroCNPJ[12];
    }
    
    public void setDigitoCNPJ(char digitoCNPJ[]){
        this.digitoCNPJ[2] = digitoCNPJ[2];
    }
    
    public void setValorFaturamento(double valorFaturamento){
        this.valorFaturamento=valorFaturamento;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public loja(String nomeFantasia, String razaoSocial, char numeroCNPJ[], char digitoCNPJ[]){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.numeroCNPJ[12] = numeroCNPJ[12];
        this.digitoCNPJ[2] = digitoCNPJ[2];
       
    }
    
     public loja(String nomeFantasia, char numeroCNPJ[], char digitoCNPJ[], double valorFaturamento, String publicoAlvo){
        this.nomeFantasia = nomeFantasia;
        this.numeroCNPJ[12] = numeroCNPJ[12];
        this.digitoCNPJ[2] = digitoCNPJ[2];
        this.valorFaturamento = valorFaturamento;
        this.publicoAlvo = publicoAlvo;
    }
    
    public void verificarFaturamento(){
        //comparar objetos
    }
    
    public double calcularAlguel(){
        return 50*getArea();
    }
}
