
/**
 *
 * @author luiz
 */

/*TelefoneOrigem, Origem, Destino, TelefoneDestino, Valor Total, inicio, termino */
public class Ligacao{
    private String telefoneOrigem;
    private String origem;
    private String telefoneDestino;
    private String destino;
    private float valorLigacao;
    
    //Irei converter o numero em texto para compor horas, minutos...
    private float inicio;
    private float termino;
    
    private Tempo tempo;
    
    //Ligacoes
    Ligacao lista[] = new Ligacao[5]; 
    
    //Métodos get
    
    public Tempo getTempo() {
        return tempo;
    }
     
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

    public float getValorLigacao() {
        return valorLigacao;
    }

    public float getInicio() {
        return inicio;
    }

    public float getTermino() {
        return termino;
    }
        
    //set
    public void setTempo(Tempo tempo) {
        this.tempo = tempo;
    }
    
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

    public void setValorLigacao(float valorLigacao) {
        this.valorLigacao = valorLigacao;
    }

    public void setInicio(float inicio) {
        this.inicio = inicio;
    }

    public void setTermino(float termino) {
        this.termino = termino;
    }
    
    //inicio- tempo 
    //Local e número de origem
    //Local e número de destino
    public Ligacao(float inicio, String origem, String destino, String TelefoneOrigem, String TelefoneDestino) {
        this.inicio = inicio;
        this.origem = origem;
        this.destino = destino;
        this.telefoneOrigem = telefoneOrigem;
        this.telefoneDestino = telefoneDestino;
    }
    
    public void gravar(Ligacao l){
         for(int i=0;i<lista.length;i++){
             if(lista[i]==null){
                 lista[i]=l;
                 break;
             }
         }
    }
    
    public boolean validadorLigacao(String telefone) {
        boolean resultadoValidador = false;
        for (int i=0;i<lista.length;i++){
            if (telefone.equals(lista[i].getTelefoneOrigem()) || telefone.equals(lista[i].getTelefoneDestino())){
                resultadoValidador = true; 
                break;
            }
        }
        return resultadoValidador;
    }
    //O calculo dá certo porque o tempo está convertido em minutos
    public float calcularLigacao(Tempo inicio, Tempo termino) {
        float t_inicial = inicio.converterMinuto(inicio.getHora(), inicio.getMinuto(),inicio.getSegundo());
        float t_final = termino.converterMinuto(inicio.getHora(), termino.getMinuto(),termino.getSegundo());
        setValorLigacao(t_final-t_inicial);
        return getValorLigacao();
    }  
}

