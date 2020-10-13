/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author jotap
 */
public class MainFuncionario {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        
        f1.getCargo();
        f1.getCracha();
        f1.getSalario();
        f1.getPercentage();
        f1.getTempo();
        f1.setValoresAumento();
        f1.calculaAumento(20);
        f1.calculaAumento(12);
        
        Funcionario f2 = new Funcionario(23162571, 5000, "Analista de Sistemas");
    
        f1.getCargo();
        f1.getCracha();
        f1.getSalario();
        f1.getPercentage();
        f1.getTempo();
        f1.setValoresAumento();
        f1.calculaAumento(10);
        f1.calculaAumento(5);
    
    }
}
