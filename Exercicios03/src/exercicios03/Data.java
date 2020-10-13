

package exercicios03;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class Data {
    int dia;
    int mes;
    int ano;
    
    Data(){
    
    this.dia = 31;
    this.mes = 12;
    this.ano = 12;
    
    };
    
    Data(int d, int m, int a){
   
    d = dia;
    m = mes;
    a = ano;
    
       
    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
    m = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês"));
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

   
    
    
    }
    
     void cadastroDados(){
    
         JOptionPane.showMessageDialog(null, "Dados Cadastrados: " + dia + ";" +  mes + ";" + ano);
         
    };
     
     
     
     void imprimiData(){
     
         JOptionPane.showMessageDialog(null, "Hoje é:" + dia + "/" + mes + "/" + ano);
     };
}
