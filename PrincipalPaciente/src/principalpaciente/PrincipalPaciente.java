/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpaciente;
import javax.swing.JOptionPane;
/**
 *
 * @author jotap
 */
public class PrincipalPaciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Criando objetos na classe Main
        
        Paciente n = new Paciente();
        Paciente r = new Paciente();
        Paciente e = new Paciente();
        Paciente t = new Paciente();
        Paciente d = new Paciente();
        Paciente p = new Paciente();

        
        //Dados dos usuário - entrada de dados
        
        n.nome = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        r.rg = JOptionPane.showInputDialog("Digite o rg do paciente: ");
        e.endereco = JOptionPane.showInputDialog("Digite o endereço do paciente: ");
        t.telefone = JOptionPane.showInputDialog("Digite o telefone do paciente: ");
        d.dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do paciente: ");
        p.profissao = JOptionPane.showInputDialog("Digite a profissão do paciente: ");

        
        // Utilizando terminal para saída de dados
        
        System.out.println("Nome: " + n.nome + "\nRG: " +r.rg + "\nEndereço: " + e.endereco + "\nTelefone: " + e.endereco + "\nData de Nascimento: " + d.dataNascimento + "\nProfissão: " + p.profissao);

        JOptionPane.showMessageDialog(null, "Nome: " + n.nome + "\nRG: " +r.rg + "\nEndereço: " + e.endereco + "\nTelefone: " + e.endereco + "\nData de Nascimento: " + d.dataNascimento + "\nProfissão: " + p.profissao);

        
    }
    
}
