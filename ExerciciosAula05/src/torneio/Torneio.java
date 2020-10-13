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
public class Torneio {
    
private String nome;
private int idade;

        public Torneio(String nome, int idade){

                this.nome = nome;
                this.idade = idade;
        };

        public String getNome(){

                return nome;
        };

        public int getIdade(){

                return idade;
        };

        void setNome(String n){

                this.nome = n;

        };

        String verificaCategoria(){

        if(idade >= 5 && idade <=7){
                return "Infantil";
        }
        else if(idade >= 8 && idade <=10)
        {
                return "Juvenil";
        }
        
        else if(idade >= 11 && idade <=15)
        {
                return "Adolescente";
        }
        
        else if(idade >= 16 && idade <=30)
        {
                return "Adulto";
        }
        
        else{
                return "Sênior";
        }

        };

        void imprimeDados(){
	
	System.out.println("Nome: " + getNome() + "\nIdade:" + getIdade() + "\nCategoria: " + verificaCategoria());

};


}
