
/**
 * Escreva uma descrição da classe Encomenda aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
public class Encomenda extends Correspondencia
{
    public float peso;
   
    public Encomenda(String data, Pessoa emitente, Pessoa destinatario, float peso){
       super(data,emitente,destinatario);
       this.peso = peso;
    }

 
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public float calcTaxa(){
        return peso*10;
    }
    
    public void imprimir(){
        /*System.out.println("Dados da correspondencia:");*/
        super.imprimir();
        System.out.println("Peso e:"+peso);
    }
}

    
