public class Tempo
{
    private int hora, minuto, segundo;
    public Tempo (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int calcSegundos(){
        return hora * 3600 + minuto * 60 + segundo;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public int getHora(){
        return this.hora;
    }
    public int getMinuto(){
        return this.minuto;
    }
    public int getSegundo(){
        return this.segundo;
    }
}

