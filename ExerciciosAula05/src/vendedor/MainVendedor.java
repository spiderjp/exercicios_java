/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;

/**
 *
 * @author jotap
 */
public class MainVendedor {
    
    public static void main(String[] args) {
        Vendedor v = new Vendedor(3000, 5000, "João", 1);
        v.calcularSalario();
        v.imprimirDados();
        
        Vendedor v2 = new Vendedor(1200, 2000, "Pedro", 1);
        v2.calcularSalario();
        v2.imprimirDados();        
    } 
}
