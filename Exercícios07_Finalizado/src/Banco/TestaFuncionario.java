/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        
        Funcionario g1 = new Gerente(123, 3, "Jefferson", "123.436.789-10", 15000) {};
        Funcionario c1 = new Caixa("Mauro", "124.867.132-23", 7000){};

        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha: " +  g1.getNome()));
        
        
        if(g1.autentica(senha)){
            
            System.out.println("Gerente" + g1.getNome() + "autenticado");
        }else{
        
            System.out.println("Acesso negado!!!");
        }
       
        System.out.println(g1.bonificacao() );
        System.out.println(c1.bonificacao());

    }
}
