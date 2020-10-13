/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class Triangulo {
    
        private double base;
        private double altura;

            public Triangulo(){};
            public Triangulo(double base, double altura){

            this.base = base;
            this.altura = altura;

            };

            public double getBase(){

                    return base;
            };

            public double getAltura(){

                    return altura;
            };

            public void setAltura(double altura){

                    this.altura = altura;

            };

            public double calculaArea(){

                    return (altura*base);
            };

            public void imprimeDados(){

                    System.out.println("Altura: " + getAltura()+ 
                    "\nBase:" + getBase() + "\nÁrea:" +calculaArea());
            };

}
