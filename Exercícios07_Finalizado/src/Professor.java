/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotap
 */
public class Professor extends Pessoa {

  
    private int matricula;
    private String Campus;

    public Professor() {
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCampus() {
        return Campus;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }
    
    
    
    public String mostraClasse() {
        return null;
        
    }
    
}
