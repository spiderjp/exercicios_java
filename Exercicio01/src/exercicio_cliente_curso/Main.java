/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_cliente_curso;

/**
 *
 * @author jotap
 */
public class Main {
    
    public static void main (String [] args){
        
    //Dados das classes - criação dos objetos da classe Cliente
    
    Cliente nome = new Cliente();
    Cliente cpf = new Cliente();
    Cliente rg = new Cliente();
    Cliente uf = new Cliente();
    Cliente cidade = new Cliente();
    Cliente cep = new Cliente();
    Cliente celular = new Cliente();
    Cliente email = new Cliente();
    Cliente idade = new Cliente();
    Cliente sexo = new Cliente();
    Cliente instagram = new Cliente();
    Cliente facebook = new Cliente();
    Curso nomecurso = new Curso();
    Curso nomeestudante = new Curso();
    Curso periodocurso = new Curso();
    Curso valormensalidade = new Curso();
    Curso instagram2 = new Curso();
    

    //Declaração dos objetos
    
    nome.nome = "João Pedro Ferreira de Souza Batista";
    cpf.cpf = "85660849342";
    rg.rg = 833512933;
    uf.UF = "SP";
    cidade.cidade = "Guarulhos";
    cep.cep = "07183-170";
    celular.celular = 976873311;
    email.email = "jotinhaplays11@gmail.com";
    idade.idade = 18;
    sexo.sexo = "Masculino";
    instagram.instagram = "jotinhaaaa11";
    facebook.facebook = "Não tenho";
    
    //Separação das Classes (Curso)
    
    nomecurso.nomeCurso = "Análise e Desenvolvimento de Sistemas";
    nomeestudante.nomeEstudante = "João Pedro Ferreira de Souza Batista";
    periodocurso.periodoCurso = 1;
    valormensalidade.valorMensalidade = 500;
    instagram2.instagram = "jotinhaaaa11";
    
   

    //Exibição dos objetos (impressão na tela)
    //Separação da Exibição dos objetos do Cliente
    
    System.out.println("Informações do Cliente:");
    System.out.println("");
    System.out.println("Nome: "+ nome.nome);
    System.out.println("CPF: "+ cpf.cpf);
    System.out.println("RG: "+ rg.rg);
    System.out.println("UF: "+ uf.UF);
    System.out.println("Cidade: "+ cidade.cidade);
    System.out.println("CEP: "+ cep.cep);
    System.out.println("Celular: "+ celular.celular);
    System.out.println("Email: "+ email.email);
    System.out.println("Idade: "+ idade.idade);
    System.out.println("Sexo: "+ sexo.sexo);
    System.out.println("Instagram: "+ instagram.instagram);
    System.out.println("Facebook: "+ facebook.facebook);
    
    //Separação da Exibição dos objetos do Curso
    
    System.out.println("");
    System.out.println("Informações do Curso:");
    System.out.println("");
    System.out.println("Nome do Curso:" + nomecurso.nomeCurso);
    System.out.println("Nome do Estudante:" + nomeestudante.nomeEstudante);
    System.out.println("Período do Curso:" + periodocurso.periodoCurso);
    System.out.println("Valor da Mensalidade:" + valormensalidade.valorMensalidade);
    System.out.println("Instagram:" + instagram2.instagram);

    
    
        
    
    
    }
    
    
}

