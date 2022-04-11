
/**
 * Escreva uma descrição da classe ContaTelefonica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaTelefonica
{
    private int mes, anoReferencia, numeroContrato;
    Ligacao ligacao;
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(int anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public ContaTelefonica(int mes, int anoReferencia, int numeroContrato) {
        this.mes = mes;
        this.anoReferencia = anoReferencia;
        this.numeroContrato = numeroContrato;
    }
    
    public ContaTelefonica(int mes, int anoReferencia, int numeroContrato, Ligacao ligacao) {
        this.mes = mes;
        this.anoReferencia = anoReferencia;
        this.numeroContrato = numeroContrato;
        this.ligacao = ligacao;
    }
    
    public float calcularValorTotal(Ligacao ligacoes){
        float soma = 0;
        for(int i=0;i<ligacoes.lista.length;i++){
            soma = ligacoes.lista[i].getValorLigacao();
        }
        return soma;
    }
    
    public float calcularValorTotal(String destino){
        float soma = 0;
        for(int i=0;i<ligacao.lista.length;i++){
            if(ligacao.lista[i].getDestino().equals(destino)){
                soma = ligacao.lista[i].getValorLigacao();
            }
        }
        return soma;
    }
}
