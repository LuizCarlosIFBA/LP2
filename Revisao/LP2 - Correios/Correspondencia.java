
/**
 * Escreva uma descrição da classe Correspondencia aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Correspondencia
{
    
private String data;
private Pessoa emitente, destinatario;

public Correspondencia(String data, Pessoa emitente, Pessoa destinatario){
    this.data =data;
    this.emitente = emitente;
    this.destinatario = destinatario;
}
    
public float calcTaxa(){
    return 0;
}

public Pessoa getDestinatario(){
    return this.destinatario;
}

public void imprimir(){
    System.out.println("Dados da correspondencia:");
    System.out.println("Data:"+data);
    System.out.println("Nome do emitente:"+emitente.getNome());
    System.out.println("Nome do emitente:"+destinatario.getNome());
    System.out.println("Taxa: R$"+calcTaxa());
}

}
