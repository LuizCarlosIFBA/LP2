public class Ligacao
{
    private String localOrig, localDest, numOrig, numDest;
    private Tempo inicio, termino;
    
    public Ligacao (String localOrig, String localDest, String numOrig, String numDest, Tempo inicio, Tempo termino){
        this.localOrig = localOrig;
        this.localDest = localDest;
        this.numOrig = numOrig;
        this.numDest = numDest;
        this.inicio = inicio;
        this.termino = termino;
    }

    public void setInicio(Tempo inicio){
        this.inicio = inicio;
    }

    public Tempo getInicio(){
        return this.inicio;
    }

    public String getLocalOrig() {
        return localOrig;
    }

    public void setLocalOrig(String localOrig) {
        this.localOrig = localOrig;
    }

    public String getLocalDest() {
        return localDest;
    }

    public void setLocalDest(String localDest) {
        this.localDest = localDest;
    }

    public String getNumOrig() {
        return numOrig;
    }

    public void setNumOrig(String numOrig) {
        this.numOrig = numOrig;
    }

    public Tempo getTermino() {
        return termino;
    }

    public void setTermino(Tempo termino) {
        this.termino = termino;
    }
    
    public int calcValorLigacao(){
          int falado, total = 0;
          int segIni, segTer;
          segIni = inicio.calcSegundos();
          segTer = termino.calcSegundos();
          
          falado = segTer - segIni;
          total = falado / 60;
          if (falado % 60 > 0)
             total++;
          
          return total;
    }
    
    public boolean checaNumero(String telefone){
        if (telefone.equals(numOrig) || telefone.equals(numDest))
           return true;
        else
           return false;
    }
	
    public String getNumDest(){
	        return this.numDest;
    }
}
