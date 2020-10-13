/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03;
import javax.swing.JOptionPane;
/**
 *
 * @author jotap
 */
public class Exercicios03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Triangulo t = new Triangulo();
        Triangulo t2 = new Triangulo();

        t.base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base: "));
        t.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
        float calculaArea1 = t.calculaArea(t.base, t.altura);
        
        t2.base = 20;
        t2.altura = 10;
        float calculaArea2 = t2.calculaArea(t2.base,t2.altura);
        
        System.out.println(t.imprimeDados(t.base, t.altura));
        System.out.println(t2.imprimeDados(t2.base, t2.altura));

        Data d = new Data();
        Data d2 = new Data();
        
        d.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de hoje: "));
        d.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de hoje: "));
        d.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de hoje: "));
       
        

        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2001;
        

        
        
        
    }
    
}
