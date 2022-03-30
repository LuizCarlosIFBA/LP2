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
    int numero;
    char CPF[] = new char[11];
    String tipo;
    Date validade;
    Date expedicao;
    int pontos;
    String situacao;
    
    
    void criarCarteira(int numero, char CPF[], String tipo,Date validade,Date expedicao, int pontos, String situacao)
    {
        this.numero = numero;
        this.CPF[11] = CPF[11];
        this.tipo = tipo;
        this.validade = validade;
        this.expedicao = expedicao;
        this.pontos = pontos;
        this.situacao = situacao;
    }
    
    void validarCarteira(){
         carteiraApreendida();
    }
    
    String carteiraApreendida(){
        if(this.pontos>20){
            return "Apreendida";
        }    
        return "Esta hapito a dirigir normalmente";    
    }
    
    int consultarPontos(){
        return this.pontos;
    }
    
    void zerarCarteira(){ 
        this.pontos=0;
    }
    
    void acrescentarPontos(int qtdPontos){ 
        this.pontos=pontos+qtdPontos;
        validarCarteira();
    }
    
    void decrementarPontos(int qtdPontos){ 
        this.pontos=pontos-qtdPontos;
    }
  
}
