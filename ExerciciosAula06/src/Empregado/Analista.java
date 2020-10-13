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
public class Analista extends Empregado {
    
    private float valorProjeto[];
    public Analista(){};

    public Analista(float[] valorProjeto) {
        this.valorProjeto = valorProjeto;
    }

    public Analista(float[] valorProjeto, String n, String m) {
        super(n, m);
        this.valorProjeto = valorProjeto;
    }

    public float[] getValorProjeto() {
        return valorProjeto;
    }


    public void setValorProjeto(float[] valorProjeto) {
        this.valorProjeto = valorProjeto;
    }

 
    

    @Override
    public float calculoSalario() {
       float salario = 0;
        for(int i = 0; i <= valorProjeto.length; i++){
            salario = salario + valorProjeto[i];
        }
        return salario;
    }    
}
