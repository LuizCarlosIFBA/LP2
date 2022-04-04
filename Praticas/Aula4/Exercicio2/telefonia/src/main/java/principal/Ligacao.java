/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package principal;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author luiz
 */
public class Ligacao{
    private String telefoneOrigem;
    private String origem;
    private String telefoneDestino;
    private String destino;
    private double valorLigacao;
    
    //Irei converter o numero em texto para compor horas, minutos...
    private double inicio;
    private double termino;

    //Ligacoes
     List<Ligacao> lista = new ArrayList<Ligacao>();
    
    //Métodos get
    public String getTelefoneOrigem() {
        return telefoneOrigem;
    }

    public String getOrigem() {
        return origem;
    }

    public String getTelefoneDestino() {
        return telefoneDestino;
    }

    public String getDestino() {
        return destino;
    }

    public double getValorLigacao() {
        return valorLigacao;
    }

    public double getInicio() {
        return inicio;
    }

    public double getTermino() {
        return termino;
    }
        
    //set
    public void setTelefoneOrigem(String telefoneOrigem) {
        this.telefoneOrigem = telefoneOrigem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setTelefoneDestino(String telefoneDestino) {
        this.telefoneDestino = telefoneDestino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setValorLigacao(double valorLigacao) {
        this.valorLigacao = valorLigacao;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public void setTermino(double termino) {
        this.termino = termino;
    }
    
    //inicio- tempo 
    //Local e número de origem
    //Local e número de destino
    public Ligacao(double inicio, String origem, String destino, String TelefoneOrigem, String TelefoneDestino) {
        this.inicio = inicio;
        this.origem = origem;
        this.destino = destino;
        this.telefoneOrigem = telefoneOrigem;
        this.telefoneDestino = telefoneDestino;
    }
    
    public Ligacao(){
    
    }
    
    public boolean validadorLigacao(String telefone) {
        boolean resultadoValidador = false;
        for (int i=0;i<lista.size();i++){
            if (telefone.equals(lista.get(i).getTelefoneOrigem()) || telefone.equals(lista.get(i).getTelefoneDestino())){
                resultadoValidador = true; 
                break;
            }
        }
        return resultadoValidador;
    }
    //O calculo dá certo porque o tempo está convertido em minutos
    public double calcularLigacao(double inicio, double termino) {
        return termino-inicio;
    }
     
    ///Telefone, originada, destinada ao número informado
    
    public static void main(String[] args) {
      
        Tempo ti = new Tempo();//Tempo inicial
        Tempo tf = new Tempo();//Tempo final
        
        Ligacao l = new Ligacao(); 

        //Tenho o tempo de inicio em horas, minutos e sengundos e converti para minutos
        double tempoMinuto = ti.converterMinuto(2, 30,0);
        Ligacao l1 = new Ligacao(tempoMinuto,"Bahia","São Paulo","5454545","343433") ;
        
        l.lista.add(l1);
        //double TotalGasto = l.calcularLigacao(ti.converterMinuto(2, 30,0),tf.converterMinuto(3,30,05));
        System.out.println("Numero encontrado "+l.validadorLigacao("343433"));
                
       
    }
}
