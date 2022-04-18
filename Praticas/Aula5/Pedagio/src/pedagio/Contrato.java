/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedagio;

/**
 *
 * @author luiz
 */
public class Contrato {
    private String cpfCNPJ;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    Pedagio pedagio;
    Data data;
    Automovel automovel;
    AutomovelCarga automovelCarga;
    AutomovelPasseio automovelPasseio;
    AutomovelPequeno automovelPequeno;
    
    Contrato automoveis[] = new Contrato[13];
    
    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contrato(String cpfCNPJ, String nome, String endereco, String email, String telefone) {
        this.cpfCNPJ = cpfCNPJ;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;   
    }
    
    public void gravarContrato(Contrato automovel){
        for(int i=0;i<automoveis.length;i++){
            if(automoveis[i]==null){
                automoveis[i]=automovel;
                break;
            }
        }
    }

    void setQtdPassagem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getQtdPassagem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
