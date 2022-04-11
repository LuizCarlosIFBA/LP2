import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Escreva uma descrição da classe loja aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class Shopping
{
    private String nome;
    //private Loja lojas;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
    Loja conjunto[] = new Loja[13]; 
    
    public void gravarLoja(Loja x){
        for(int i = 0;i<conjunto.length;i++){
            if(conjunto[i] == null){
                conjunto[i] = x;
            }
        }
    }
    
    /*Um membro que permita verificar qual o nome de fantasia da loja com maior faturamento do shopping*/
    public String verificarMaiorFat() {
        //Ira ajudar a armazenar o indice do maior fa
        float maior = conjunto[0].getFaturamento();
        int indice = 0;
        for(int i = 0;i<conjunto.length;i++){
            if(conjunto[i].getFaturamento()>maior){
                maior = conjunto[i].getFaturamento();
                nome = conjunto[i].getNomeFantasia();;
            }
        }
        return nome;
    }
    
    /*b) Um membro que permita verificar qual o faturamento médio das lojas com aluguel superior a R$1.000,00 .*/
    public float calcularMediaAluguel(){
        float somaAlugel=0;
        int qtdAlugel=0;
        for(int i = 0;i<conjunto.length;i++){
            if(conjunto[i].calcAluguel()>1000){
                somaAlugel=somaAlugel+conjunto[i].calcAluguel();
                qtdAlugel++;
            }
        }
        return somaAlugel/qtdAlugel;
    }
}
