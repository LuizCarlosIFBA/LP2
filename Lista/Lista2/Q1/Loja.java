import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Escreva uma descrição da classe loja aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

/*public class Loja implements Comparable<Loja>*/
public class Loja
{
    private String nomeFantasia, razaoSocial;
    private String numeroCNPJ;
    private String digitoCNPJ;
    private float valorFaturamento;
    private double area;
    
    //Servirao para comparar lojas
    List<Loja> lista = new ArrayList<Loja>();
         
    //O publico alvo foi pedido no meio do enunciado, na hora que se cria um dos construtores de loja
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
    
    public String getNumeroCNPJ(){
        return this.numeroCNPJ;
    }
    
    public String getDigitoCNPJ(){
        return this.digitoCNPJ;
    }
    
    public float getValorFaturamento(){
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
    
    public void setNumeroCNPJ(String numeroCNPJ){
        this.numeroCNPJ=numeroCNPJ;
    }
    
    public void setDigitoCNPJ(String digitoCNPJ){
        this.digitoCNPJ = digitoCNPJ;
    }
    
    public void setValorFaturamento(float valorFaturamento){
        this.valorFaturamento=valorFaturamento;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public Loja(String nomeFantasia, String razaoSocial, String numeroCNPJ, String digitoCNPJ){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.numeroCNPJ = numeroCNPJ;
        this.digitoCNPJ = digitoCNPJ;
       
    }
    
     public Loja(String nomeFantasia, String numeroCNPJ, String digitoCNPJ, float valorFaturamento, String publicoAlvo){
        this.nomeFantasia = nomeFantasia;
        this.numeroCNPJ = numeroCNPJ;
        this.digitoCNPJ = digitoCNPJ;
        this.valorFaturamento = valorFaturamento;
        this.publicoAlvo = publicoAlvo;
    }
    
    public void gravar(Loja lojas){
        lista.add(lojas);//Grava
    }
    
    public void verificarFaturamento(){
        compararFaturamento();
        System.out.println("A empresa com maior faturamento e "+lista.get(compararFaturamento()).getNomeFantasia()+" A empresa com maior faturamento e "+lista.get(compararFaturamento()).getValorFaturamento());    
    }    
 
    public int compararFaturamento(){
        float maior = lista.get(0).getValorFaturamento();
        int indice = 0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getValorFaturamento()>maior){
                indice = i;
                maior = lista.get(i).getValorFaturamento();
            }else indice = i;        
        }
        return indice;
    }
    
    //Poderia especializar mais o metodo, mas evitei criar mais deles para nao fugir do enunciado
    /*public void verificarFaturamento(){
        for (Loja lojas: lista) {
            compareTo(lojas);//Compara
            Collections.sort(lista);//ordena
            System.out.println("A loja "+lista.get(lista.size()).getNomeFantasia()+" e a que tem maior faturamento");
        }
        //java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        //if(lista.length!=0)
    }
    
    @Override public int compareTo(Loja lojas) { //implementação }
        if (this.valorFaturamento > lojas.getValorFaturamento()) { 
          return -1; 
        } if (this.valorFaturamento  < lojas.getValorFaturamento()) { 
            return 1; 
          } 
        return 0; 
    }*/
    
    public double calcularAluguel(){
        return 50*getArea();
    }
}
