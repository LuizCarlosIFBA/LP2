public class Correio
{
private String cnpj;
private Agencia[] agencias = new Agencia[100];
public Correio(String cnpj){
this.cnpj= cnpj;
}
public void setCnpj(String cnpj){
this.cnpj = cnpj;
}
public String getCnpj(){
return cnpj;
}
}