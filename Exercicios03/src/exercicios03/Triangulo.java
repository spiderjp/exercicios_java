/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03;

/**
 *
 * @author jotap
 */
public class Triangulo {
    
    float base;
    float altura;
    
    
     Triangulo(){};
    
    Triangulo(float b, float a){
       
    this.base = b;
    this.altura = a;
    
    };
    
    float calculaArea(float base, float altura){
    
     
    return((base*altura/2));
    
    };
    
    String imprimeDados(float base, float altura){
    
    this.base = base;
    this.altura = altura;
    float area = calculaArea(base,altura);
    
    return("\nBase: " + base + "\nAltura: " + altura + "\nÁrea: " + area);
            
    };
    
}
