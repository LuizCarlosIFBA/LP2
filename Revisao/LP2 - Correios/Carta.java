
/**
 * Escreva uma descrição da classe Carta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Carta extends Correspondencia
{
    
Cep cep;
    
public Carta(String data, Pessoa emitente, Pessoa destinatario){
    super(data,emitente,destinatario);
}

public float calcTaxa(){
    return getDestinatario().getCepPessoa().getValor();
}

}
