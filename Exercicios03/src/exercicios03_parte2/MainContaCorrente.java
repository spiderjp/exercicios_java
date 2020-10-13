
package exercicios03_parte2;
import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class MainContaCorrente {
    public static void main(String[] args) {
        
        //Criando dois objetos: c1 e c2 da Classe ContaCorrente
        
        
        ContaCorrente c1 = new ContaCorrente("João Pedro Batista", 100000, 2000000, 'A');  
        
        System.out.println(c1);
        
        ContaCorrente c2 = new ContaCorrente("João Pedro Batista", 100000, 'A');
        
       System.out.println(c2);
     
       ContaCorrente d1 = new ContaCorrente(){};
       
       //Pedindo valores de depósito e saque da primeira forma
       
       d1.deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito: "));
       d1.saque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque: "));

       
       //Ou podemos utilizar desse terceiro modo as classes, parâmetros e objetos
       
        ContaCorrente c3;
        float saldo, limite, valorDeposito, valorSaque;
        
      
        String nome = JOptionPane.showInputDialog(null, "Digite seu Nome: ");
        saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu saldo"));
        limite = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu limite"));
        String tipoa = JOptionPane.showInputDialog(null, "Digite o tipo de conta (Conta Corrente = C Conta Poupança = P): ");
        char tipo = tipoa.charAt(0);
        
        c3 = new ContaCorrente(nome, saldo, limite, tipo);
        
        c3.imprimeDados();
        valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
        c3.sacar(valorSaque);
        c3.imprimeDados();
        valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
        c3.depositar(valorDeposito);        
        c3.imprimeDados();
        
   
}
    
}
