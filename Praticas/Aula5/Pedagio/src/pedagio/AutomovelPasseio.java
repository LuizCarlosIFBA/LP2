/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedagio;

/**
 *
 * @author luiz
 */
public class AutomovelPasseio extends Automovel{
    private int qtdPesssoas;

    public int getQtdPesssoas() {
        return qtdPesssoas;
    }

    public void setQtdPesssoas(int qtdPesssoas) {
        this.qtdPesssoas = qtdPesssoas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public AutomovelPasseio(int qtdPesssoas, String placa, int anoFabricacao) {
        super(placa, anoFabricacao);
        this.qtdPesssoas = qtdPesssoas;
    }
    
    
}
