import java.util.*;
/**
 * Escreva uma descrição da classe Carteira aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Carteira
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numero;
    private char CPF[] = new char[11];
    private String tipo;
    private Date validade;
    private Date expedicao;
    private int pontos;
    private String situacao;
    
    /*Get*/
    public int getNumero(){ 
        return numero;
    }

    public char getCPF(){ 
        return CPF[11];
    }

    public String getTipo(){ 
        return tipo;
    }

    public Date getValidade(){ 
        return validade;
    }

    public Date getExpedicao(){ 
        return  expedicao;
    }
    
    public int getPontos(){ 
        return pontos;
    }
    
    public String getSituacao(){ 
        return situacao;
    }

    /*Set*/
    public void setNumero(int numero){ 
        this.numero=numero;
    }

    public void setCPF(char CPF[]){ 
        this.CPF[11]=CPF[11];
    }

    public void setTipo(String tipo){ 
        this.tipo=tipo;
    }

    public void setValidade(Date validade){ 
        this.validade=validade;
    }

    public void setExpedicao(Date expedicao){ 
        this.expedicao=expedicao;
    }
    
    public void setPontos(int pontos){ 
        this.pontos=pontos;
    }
    
    public void setSituacao(String situacao){ 
        this.situacao=situacao;
    }

    
    /**
     * Construtor para objetos da classe Carteira
     */
    public void criarCarteira(int numero, char CPF[], String tipo,Date validade,Date expedicao, int pontos, String situacao)
    {
        this.numero = numero;
        this.CPF[11] = CPF[11];
        this.tipo = tipo;
        this.validade = validade;
        this.expedicao = expedicao;
        this.pontos = pontos;
        this.situacao = situacao;
    }
    
    public void validarCarteira(){
      //implementar mais tarde    
    }
    
    public String CarteiraApreendida(){
        if(this.pontos>20){
            setSituacao("apreendida");
        }    
        return "Sua carteira esta apreendida";    
    }
    
    public int consultarPontos(){
        return this.pontos;
    }
    
    public void zerarCarteira(){ 
        this.pontos=0;
    }
    
    public void acrescentarPontos(int qtdPontos){ 
        this.pontos=pontos+qtdPontos;
        CarteiraApreendida();
    }
    
    public void decrementarPontos(int qtdPontos){ 
        this.pontos=pontos-qtdPontos;
    }
    
    
 
}
