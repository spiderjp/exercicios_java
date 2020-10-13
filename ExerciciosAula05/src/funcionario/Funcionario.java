/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author jotap
 */
public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;
    private float percentage;
    private int tempo;
    
    public Funcionario(){
    
           cargo = "Assistente";
    };
    
    public int getCracha(){
    
        cracha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do crachá: "));
        return cracha;
        
    };
    
    public void setCracha(int cracha){
        
        this.cracha = cracha;
    };
    
    
    
    public float getSalario(){
        
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário: "));
        return salario;
    };
    
     public void setSalario(float salario){
        
        this.salario = salario;
    };
     
     
    
    
    public String getCargo(){
    
        cargo = (JOptionPane.showInputDialog(null, "Digite o nome do Cargo: "));
        return cargo;
    };
    
        public void setCargo(String cargo){
        
        this.cargo = cargo;
    };
    
    
        
    public int getTempo(){
    
        tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de anos trabalhado: "));
        return tempo;
    };
    
        public void setTempo(int tempo){
        
        this.tempo = tempo;
    };
    
        
        
    
    public float getPercentage(){
    
        percentage = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porcentagemá: "));
        return percentage;
    };

   
        public void setPercentage(float percentage){
        
        this.percentage = percentage;
    };
    
        
        

    public Funcionario(int c, float s, String car){
    
        this.cargo = Integer.toString(c);
        this.salario = s;
        this.cracha = Integer.getInteger(car);
    };

    public void setValoresAumento(){
        
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salário: "));
        percentage = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a porcentagem: "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de anos trabalhada: "));
    };
    
    
    
    

    public float calculaAumento(float porcentagem){

        
       return ((porcentagem/100*salario)+salario);
    };

     public double calculaAumento(int tempo){
    
        
     
       return (salario+(150.00* tempo));

    };
     
      

}