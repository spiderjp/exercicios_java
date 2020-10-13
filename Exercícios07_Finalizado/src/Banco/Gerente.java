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
public class Gerente extends Funcionario{

    private int senha;
    private int funcionariosGerenciados;

    public Gerente() {
    }

    
    public Gerente(int senha, int funcionariosGerenciados) {
        this.senha = senha;
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    public Gerente(int senha, int funcionariosGerenciados, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    public int getSenha() {
        return senha;
    }

    public int getFuncionariosGerenciados() {
        return funcionariosGerenciados;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setFuncionariosGerenciados(int funcionariosGerenciados) {
        this.funcionariosGerenciados = funcionariosGerenciados;
    }
    
    
    
    @Override
    public boolean autentica() {
        return true;
    }

    @Override
    public double bonificacao() {
        return getSalario() * 0.15;
    }
    
}
