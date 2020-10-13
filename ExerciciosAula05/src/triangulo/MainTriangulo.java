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
public class MainTriangulo {
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(){};
        
        t1.getBase();
        t1.getAltura();
        t1.calculaArea();
        t1.imprimeDados();
        
        Triangulo t2 = new Triangulo(20., 10);
        
        t2.calculaArea();
        t2.imprimeDados();
}
}
