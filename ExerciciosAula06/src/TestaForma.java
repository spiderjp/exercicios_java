
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotap
 */
public class TestaForma {
    
    public static void main(String[] args) {
        
        //Circunferencia c = new Circunferencia();
        
        //Retangulo r = new Retangulo(20, 20);
        
        float raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o raio da circunferência em cm."));
        Circunferencia c = new Circunferencia(raio);
        
        c.area();
        c.perimetro();
        c.mostra();
        
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da altura do retângulo em cm."));
        float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da base do retângulo em cm."));

        Retangulo r1 = new Retangulo(altura, base);
        
        r1.area();
        r1.perimetro();
        r1.mostra();
        
        
        
    }
}
