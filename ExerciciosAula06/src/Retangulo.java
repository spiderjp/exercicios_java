/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotap
 */
public class Retangulo extends Triangulo{

    public Retangulo() {
    }
    

    public Retangulo(float base, float altura) {
        super(base, altura); //O super é de onde ele pega esses valores, no caso da classe pai (superclass, que é o triângulo)
    }
    
    
    public float area(){
    
        return getAltura() + getBase();
    }
    
    public float perimetro(){
    
        return getAltura() + getBase()*2;
    }
    
    public void mostra(){
    
        System.out.println("-----Retângulo-----"
                            +"\nBase: " + getBase()
                           + "\nAltura: " + getAltura()
                                    +"\nPerimetro: " + perimetro());

    }
}
