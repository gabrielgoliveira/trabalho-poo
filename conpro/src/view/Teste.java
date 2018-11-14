package view;

import java.util.Scanner;

import connection.*;
import model.*;

public class Teste {
    public static void cadastraLoja(){
        Loja novaLoja;
        Endereco novoEndereco;
        String razaoSocial, cnpj, senha;
        String rua, bairro, cidade, estado;
        Cadastrar cadastro = new Cadastrar();
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastrar Loja");
        System.out.print("Razao Social: ");
        razaoSocial = ler.nextLine();
        System.out.print("CNPJ: ");
        cnpj = ler.nextLine();
        System.out.print("Senha: ");
        senha = ler.nextLine();
            
        System.out.print("Rua: ");
        rua = ler.nextLine();
        System.out.print("Bairro: ");
        bairro = ler.nextLine();
        System.out.print("Cidade: ");
        cidade = ler.nextLine();
        System.out.print("Estado: ");
        estado = ler.nextLine();
        novoEndereco = new Endereco(rua, bairro, cidade, estado);
        novaLoja = new Loja(razaoSocial, cnpj, senha, novoEndereco);
            
        cadastro.createLoja(novaLoja);
<<<<<<< HEAD
=======

>>>>>>> 65f6f344dfb416415b0b651d3b353f27bea0d9b8
    }
    
public static void alterarLoja(Loja loja){
        
        Endereco endereco = loja.getEndereco();
        int flag;
        
        Cadastrar cadastro = new Cadastrar();
        Scanner ler = new Scanner(System.in);

        System.out.println("Alterar Loja");
        System.out.print("Alterar Razao Social ?\n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            loja.setRazaoSocial(ler.nextLine());
        }
        System.out.print("Alterar CNPJ ?\n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            loja.setCnpj(ler.nextLine());
        }
        System.out.print("Alterar Senha ? \n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            loja.setSenha(ler.nextLine());
        }
            
        System.out.print("Alterar Rua ? \n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            endereco.setRua(ler.nextLine());
        }
       
        System.out.print("Alterar Bairro ? \n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            endereco.setBairro(ler.nextLine());
        }
       
        System.out.print("Alterar Cidade ? \n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            endereco.setCidade(ler.nextLine());
        }
        
        System.out.print("Alterar Estado ?\n1 - Sim || 0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            endereco.setEstado(ler.nextLine());
        }
        
        cadastro.alterarLoja(loja);
    }
    public static void interfaceCadastroProduto(Loja loja){
        Produto produto;
        String nome;
        int qtde;
        double preco;
        Cadastrar cadastrar = new Cadastrar();
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Nome Produto: ");
        nome = ler.nextLine();
        System.out.print("Quantidade: ");
        qtde = ler.nextInt();
        ler.nextLine();
        System.out.print("Valor: ");
        preco = ler.nextDouble();
        ler.nextLine();
        
        produto = new Produto(nome, qtde, preco);
        cadastrar.cadastrarProduto(loja, produto);
    }
    public static void interfaceLoja(Loja loja){
        int flag = 1;
        Scanner ler = new Scanner(System.in);
        while(flag != -1){
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Alterar Dados Loja");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Buscar produto");
            System.out.println("4 - Buscar todos os produtos");
            System.out.print("-1 para sair\nEntre com a opcao desejada: ");
            flag = ler.nextInt();
            ler.nextLine();
            switch(flag){
                case 1:
                    interfaceCadastroProduto(loja);
                    System.out.println("Cadastrado !!");
                break;
                
                case 2:
                    alterarLoja(loja);
                    System.out.println("Alterado !!");
                break;
                
                case 3:
                    
                break;
                
                case 4:
                    
                break;
                
                default:
                   //limpa tela
                   for (int i = 0; i < 100; ++i){  
                    System.out.println();
                   }
                   
                   System.out.println("Opcao Invalida");
                   
            }
            //limpa tela
            for (int i = 0; i < 100; ++i){  
                      System.out.println();
            }
        }
        
    }
    public static void main(String[] args){
        String cnpj;
        String senha;
        int flag;
        Loja loja;
        
        Cadastrar cadastrar = new Cadastrar();
        Scanner ler = new Scanner(System.in);
        System.out.println("Ja tem cadastro ?\n1 - Sim\n0 - Nao\n: ");
        flag = ler.nextInt();
        ler.nextLine();
        if(flag == 1){
            //login
            System.out.println("Login");
            System.out.println("CNPJ");
            cnpj = ler.nextLine();
            System.out.println("Senha");
            senha = ler.nextLine();

            if(cadastrar.checkLogin(cnpj, senha)){
                loja = cadastrar.obterLoja(cnpj);
                interfaceLoja(loja);
                
            } else {
                System.out.println("Senha Invalida");
            }
        } else {
           cadastraLoja();
        }
       
    }
    	
}
