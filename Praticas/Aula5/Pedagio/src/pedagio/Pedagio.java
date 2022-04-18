/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedagio;

/**
 *
 * @author luiz
 */
public class Pedagio {
    Contrato contrato;
    Contrato gravarAutomovel;
    private String tipoAutomovel;
    
  
    public String getTipoAutomovel() {
        return tipoAutomovel;
    }   

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public float calcularPedagioCarga(float peso) {
        setTipoAutomovel("Carga");
        return 2*peso;
    }
    
    //Os valores de baixo sempre retornaram inteiro, um deles porque multiplica inteiro
    //com inteiro e outro porque retorna um inteiro fixo
    public int calcularPedagioPasseio(int qtdPessoa){
        setTipoAutomovel("Passeio");
        return 5*qtdPessoa;
    }
    
    public int calcularPedagioPequeno(){
        setTipoAutomovel("Pequeno");
        return 6;
    }
    
    
    /*
   A empresa que administra o pedágio da BR101 oferece um serviço para clientes que trafegam diariamente
   pela rodovia onde é instalado um equipamento no automóvel para sempre que este passe pelo pedágio, 
   não precise parar e fazer o pagamento. O equipamento emite um sinal para a empresa que registra a 
   passagem e emite uma fatura para pagamento mensal no final do mês. A empresa solicita que você 
   desenvolva esse sistema de acordo com a seguinte especificação Todo automóvel que trafega na rodovia 
   possui uma placa e um ano de fabricação. Existem vários tipos de automóveis. Os automóveis de carga
   devem registrar também o peso máximo que podem carregar; os automóveis de passeio devem registrar a 
   quantidade de passageiros que pode comportar (em unidades); e os automóveis pequenos (exe. Moto) 
   devem registrar o modelo do automóvel. Desta forma, os clientes fazem um contrato com a empresa
   informando seu CPF/CNPJ, nome, endereço, email e telefone. Cada cliente pode cadastrar diversos 
   automóveis em seu contrato. Cada vez que um automóvel passa pelo pedágio fica registrada uma 
   passagem guardando a data e a hora. Por exemplo, o cliente de CPF 1234, chamado Maria, que mora na
   Rua Amazonas, tem email Maria@gmail.com e telefone 99999999, registra um automóvel de passeio de 
   placa ABS-2233, ano 2009 com 5 passageiros. Durante o mês este automóvel passa 10 vezes pelo pedágio, 
   então são registradas 10 passagens associados ao automóvel cada uma com data e hora. O valor do pedágio
   varia a depender do tipo do automóvel. O automóvel de carga paga R$ 2.00 por quilo que o automóvel 
   pode carregar. O automóvel de passeio paga R$ 5,00 por quantidade de pessoas que comporta. 
   O automóvel pequeno para uma taxa única de R$ 6.00.
    */
   
    
  
}
