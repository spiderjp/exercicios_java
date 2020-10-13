/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneio;

/**
 *
 * @author jotap
 */
public class MainTorneio {
    public static void main(String[] args) {
        
        Torneio t1 = new Torneio("João Paulo", 13){};
        
        t1.getIdade();
        t1.getNome();
        t1.getClass();
        t1.verificaCategoria();
        t1.imprimeDados();
        
        Torneio t2 = new Torneio("Alfonso", 35){};
        
        t2.getIdade();
        t2.getNome();
        t2.getClass();
        t2.verificaCategoria();
        t2.imprimeDados();
        
        Torneio t3 = new Torneio("Ana", 7){};
        
        t3.getIdade();
        t3.getNome();
        t3.getClass();
        t3.verificaCategoria();
        t3.imprimeDados();
    }
}
