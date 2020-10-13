/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empregado;

/**
 *
 * @author jotap
 */
public abstract class Empregado {
    protected String nome;
    protected String matricula;
    
    public Empregado(){};
    public Empregado(String n, String m){
    
        this.nome = n;
        this.matricula = m;
    };

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public abstract float calculoSalario();
}
