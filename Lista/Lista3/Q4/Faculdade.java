
/**
 * Escreva uma descrição da classe Curso aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Faculdade
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeFaculdade;
    private int anoCriacaoFaculdade;
    private int duracao;
    private double valorTotal;
    Curso cursos;
    
    /*· 
     * Remover um Curso dado um nome, passado como parâmetro. Se não houver nenhum curso com o nome fornecido,
     * uma mensagem deve ser impressa na tela informando o fato;
     * Retornar uma nova Faculdade (uma nova instância da classe Faculdade) que contenha como cursos, os cursos
     * que foram criados no máximo 5 anos depois da Faculdade. Este método deve receber como parâmetro o nome e 
     * o ano de criação da nova faculdade.*/
    
    Curso curso[] = new Curso[10];
    
    public Curso getCurso(Curso cursos){
        return cursos;
    }
        
    public String getNomeFaculdade(){
        return nomeFaculdade;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public int getAnoCriacaoFaculdade(){
        return anoCriacaoFaculdade;
    }
       
    public void setCurso(Curso cursos){
        this.cursos=cursos;
    }
    
    public void setNome(String nomeFaculdade){
        this.nomeFaculdade=nomeFaculdade;
    }
    
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
    
    public void setValorTotal(double valorTotal){
        this.valorTotal=valorTotal;
    }
    
    public void setAnoCriacaoFaculdade(int anoCriacaoFaculdade){
        this.anoCriacaoFaculdade=anoCriacaoFaculdade;
    }
        
    public Faculdade(String nomeFaculdade, int anoCriacaoFaculdade){
        this.nomeFaculdade=nomeFaculdade;
        this.anoCriacaoFaculdade=anoCriacaoFaculdade;
    }
    
     public void cursoFaculdade(String nomeFaculdade,int codigo, String nome, double valorTotal,int duracao, int anoCriacao, int anoCriacaoFaculdade){
        if(verificarCursosIguais(nome,nomeFaculdade)){
            System.out.println("Curso repetido, nao pode ser cadastrado");
        }else{
            cursos.setNomeFaculdade(nomeFaculdade);
            cursos.setCodigo(codigo);
            cursos.setNome(nome);
            cursos.setValorTotal(valorTotal);
            cursos.setDuracao(duracao);
            cursos.setAnoCriacao(anoCriacao);
            cursos.setAnoCriacaoFaculdade(anoCriacaoFaculdade);
            gravar(cursos);
        }
     
    }
    
    public void gravar(Curso c){
        for(int i = 0;i<curso.length;i++){
            if(curso[i]!=null){
                curso[i] = c;
                break;
            };
        }
    }
    
    public void gravar(String cursoFaculdade){
        boolean remocao = false;
        for(int i = 0;i<curso.length;i++){
            if(cursoFaculdade.equals(curso[i].getNome())){
                curso[i].setNome(null);
                remocao = true;
                break;
            }
        }
        if(remocao==false)System.out.println("Numero nao encontrado, entao ele nao podera ser removido");
    }
    
    
    public boolean verificarCursosIguais(String cursoFaculdade,String faculdade){
        boolean resultado = false;
        for(int i = 0;i<curso.length;i++)
            if(cursoFaculdade.equals(curso[i].getNome()) && faculdade.equals(curso[i].getNomeFaculdade())){
                resultado = true;
                break;
            }else resultado = false;
            
        return resultado; 
    }
   
    public Curso retornaFaculdade(Curso faculdade){
       return faculdade;     
    }   
       
    public void verificarFaculdade(String nome, int anoCriacao){
        for(int i = 0;i<curso.length;i++){
            if(nome.equals(curso[i].getNomeFaculdade()) && anoCriacao==curso[i].getAnoCriacao()){
                for(int j = 0;j<curso.length;j++){
                    if(anoCriacao<=(curso[i].getAnoCriacaoFaculdade()+5)){
                        retornaFaculdade(curso[i]);
                    }
                }
            }   
        }               
    }
    
    public double calcularValorCurso(){
        return this.valorTotal/(this.duracao*6);
    }
}
