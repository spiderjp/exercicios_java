/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios03_parte2;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class ContaCorrente {
    
    String nome;
    float saldo;
    float deposito; 
    float saque;
    float limite;
    char tipo;
    
    
    
    
    ContaCorrente(){};
    
    ContaCorrente(String n, float s, float l, char t ){
    
       this.nome = n;
       this.saldo = s;
       this.limite = l;
       this.tipo = t;
    };
    
    ContaCorrente(String n, float s, char t){
    
        this.nome = n;
        this.saldo = s;
        this.tipo = t;
    
    };

    //Método void com nome cadastroDados
    
   void cadastroDados(){
   
       JOptionPane.showMessageDialog(null, "\nNome: " + nome + "\nSaldo: " + saldo + "\nLimite: " + limite + "\nTipo: " + tipo );


   
   };
   
   //Método void com nomne imprimeDados
   
   void imprimeDados(){
   
       JOptionPane.showMessageDialog(null, "\nNome: " + nome + "\nSaldo: " + saldo + "\nLimite: " + limite + "\nTipo: " + tipo );

       
   };
   
   //Método void com nome depositar
   
    void depositar(float valor){

      saldo = saldo - valor;
      
      JOptionPane.showInputDialog(valor);

    };

    //Método void com nome sacar
    
    void sacar(float valor){

        saldo = saldo + valor;
        
        JOptionPane.showInputDialog(valor);
    };
   
}
