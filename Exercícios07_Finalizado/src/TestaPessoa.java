
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
public class TestaPessoa {
    public static void main(String[] args) {
        
        Pessoa p = null;
        
           int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção: "
                    
                    + "\n1 - Aluno"
                    + "\n2 - Professor"
                    + "\n3 - Funcionário"
                    + "\n4 -  Sair"));
           
           switch(tipo){
           
               case 1: 
                    p = new Aluno();
                    
               case 2: 
                    p = new Professor();
                          
                    
                case 3: 
                    p = new Funcionario();
                    
                    
                    
              case 4: 
                    System.out.println("Bye...Bye");
                    System.exit(0);
                    
              default:
                    System.out.println("Opção inválida");
                    System.exit(0);
           }
           
           p.mostraClasse();
   
    }
}
