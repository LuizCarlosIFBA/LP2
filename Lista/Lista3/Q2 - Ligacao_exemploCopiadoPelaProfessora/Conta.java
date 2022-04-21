public class Conta
{
    private String nome;
    private int contrato, mes, ano;
    private Ligacao[] listaLig = new Ligacao[100];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Ligacao[] getListaLig() {
        return listaLig;
    }

    public void setListaLig(Ligacao[] listaLig) {
        this.listaLig = listaLig;
    }
    
    
    
    public Conta(String nome, int contrato, int mes, int ano){
        this.nome = nome;
        this.contrato = contrato;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void addLigacao(Ligacao lig){
        for (int i=0; i<100; i++)
          if (listaLig[i] == null){
               listaLig[i] = lig;
               break;
            }
    }
    
    public int totalConta(){
        int total = 0;
        for (int i=0; i<20; i++)
          if (listaLig[i] != null)
             total += listaLig[i].calcValorLigacao();
        return total;
    }

    /**
     * public int totalConta(String tel){
	
        int total = 0;
	for (int i = 0;i<20;i++)           
            if (listaLig[i] !=null)
		if (listaLig[i].getNumDest().equals(tel))
		   total += listaLig[i].calcValorLigacao();
       return total    
    }*/


    public int totalConta(String tel){
	int total = 0;
	for (int i = 0;i<20;i++)
		if (listaLig[i] !=null)
			if (listaLig[i].checaNumero(tel))
		   total += listaLig[i].calcValorLigacao();  
        return total;
    }

}




