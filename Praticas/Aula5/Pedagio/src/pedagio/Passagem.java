/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedagio;

/**
 *
 * @author luiz
 */
public class Passagem {

    Contrato contrato;
    Automovel automovel;
    Pedagio pedagio;

    int qtdPassagem;

    Contrato passagem[] = new Contrato[13];

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Pedagio getPedagio() {
        return pedagio;
    }

    public void setPedagio(Pedagio pedagio) {
        this.pedagio = pedagio;
    }

    public int getQtdPassagem() {
        return qtdPassagem;
    }

    public void setQtdPassagem(int qtdPassagem) {
        this.qtdPassagem = qtdPassagem;
    }

    public Contrato[] getPassagem() {
        return passagem;
    }

    public void setPassagem(Contrato[] passagem) {
        this.passagem = passagem;
    }
    
    

    public void registrarPassagem(String cpfCNPJ, String nome, String endereco, String email, String telefone) {
        contrato.automovel.getPlaca();
        contrato.automovel.getAnoFabricacao();
        contrato.setCpfCNPJ(cpfCNPJ);
        contrato.setNome(nome);
        contrato.setEndereco(endereco);
        contrato.setEmail(email);
        contrato.setTelefone(telefone);
        contrato.pedagio.getTipoAutomovel();
        contrato.data.getData();
        contrato.data.getHora();
        if (pedagio.getTipoAutomovel().equals("Carga")) {
            contrato.automovelCarga.getPesoMaximo();
        } else if (pedagio.getTipoAutomovel().equals("Passeio")) {
            contrato.automovelPasseio.getQtdPesssoas();
        } else {
            contrato.automovelPequeno.getModelo();
        }

        contrato.setQtdPassagem(getQtdPassagem()+1);
        
        gravarPassagem(contrato);
        
        //não testado ainda
        for (int i = 0; i < passagem.length; i++) {
            if (passagem[i].getCpfCNPJ() != null) {
                passagem[i].setQtdPassagem(passagem[i].getQtdPassagem()+1);
                break;
            }
        }
    }

    public void gravarPassagem(Contrato pedagio) {
        for (int i = 0; i < passagem.length; i++) {
            if (passagem[i] == null) {
                passagem[i] = pedagio;
                break;
            }
        }
    }

   
}
