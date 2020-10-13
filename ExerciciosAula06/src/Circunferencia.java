/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotap
 */
public class Circunferencia extends Forma{

    private float raio;

    public Circunferencia() {
    }

    public Circunferencia(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
     
    public float perimetro(){
    
        return (float)(2*Math.PI)*raio;
    };
    
    @Override
    public float area() {
        return (float)Math.PI*raio; // (Float) é para converter o Pi que é um valor double em float.
    }

    @Override
    public void mostra() {
        System.out.println("-----Circunferência-----"
                            +"\nRaio: " + raio
                           + "\nÁrea: " + area()
                            +"\nPerimetro: " + perimetro());
    }
    
}
