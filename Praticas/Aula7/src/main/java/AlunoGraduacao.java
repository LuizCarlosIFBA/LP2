/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 071720382
 */
public class AlunoGraduacao extends Pessoa {
    private String curso;

    public AlunoGraduacao(String curso, String cpf, String nome) {
        super(cpf, nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public float calcula(){
        return 300;
    }
}
