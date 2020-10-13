/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalprodutos;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class PrincipalProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando objetos na classe Main
        
        Produto m = new Produto();
        Produto f = new Produto();
        Produto cb = new Produto();
        Produto p = new Produto();
        
        //Dados dos usuário - entrada de dados
        
        m.marca = JOptionPane.showInputDialog("Digite o nome da marca: ");
        f.fabricante = JOptionPane.showInputDialog("Digite o nome do fabricante: ");
        cb.cod_barras = JOptionPane.showInputDialog("Digite o código de barras: ");
        p.preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto: "));
        

        JOptionPane.showMessageDialog(null, "Marca: " + m.marca + "\nFabricante: " + f.fabricante + "\nCódigo de Barras: " + cb.cod_barras + "\nPreço: R$" + p.preco);
        

    }
    
}
