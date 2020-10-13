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
public class Programador extends Empregado{
    private float qtdHoras;
    private float valorHora;

    public Programador() {
    }

    public Programador(float qtdHoras, float valorHora) {
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Programador(float qtdHoras, float valorHora, String n, String m) {
        super(n, m);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

   

    public float getQtdHoras() {
        return qtdHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setQtdHoras(float qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
   

    @Override
    public float calculoSalario() {
        return valorHora * qtdHoras;
    
    }
    
}
