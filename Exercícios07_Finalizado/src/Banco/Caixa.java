/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author jotap
 */
public class Caixa extends Funcionario{

    public Caixa(){};

    Caixa(String mauro, String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public boolean autentica() {
        
        return true;
    }

    @Override
    public double bonificacao() {
        return getSalario() * 0.10;
        
    }
    
}
