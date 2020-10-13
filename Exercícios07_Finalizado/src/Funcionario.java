/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotap
 */
public  class Funcionario extends Pessoa{

    private int matricula;
    private String setor;

    public Funcionario() {
    }

    public int getMatricula() {
        return matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    public String mostraClasse() {
        return null;
        
    }
    
    
}
