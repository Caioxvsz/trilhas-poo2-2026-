/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.produto;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {
       System.out.println("Testando objetos da classe produto");
      
       Produto p1 = new Produto("Acerola",34.9f,89);
       
       Produto p2 = new Produto("Monster",67.9f,201);

       System.out.println("Nome:" + p1.getNome());
       System.out.println("Preço:" + p1.getPreco());
       System.out.println("Quantidade:" + p1.getQuantidade());
               
                       
        System.out.println();
                       
        System.out.println("Nome:" + p2.getNome());
        System.out.println("Preço:" + p2.getPreco());
        System.out.println("Quantidade:" + p2.getQuantidade());
        
        Produto p3 = new Produto();
        Produto p4 = new Produto();

        p3.setNome("Banana");
        p3.setPreco(12.5f);
        p3.setQuantidade(50);

        p4.setNome("Coca um");
        p4.setPreco(8.9f);
        p4.setQuantidade(120);

        System.out.println("Nome:" + p3.getNome());
        System.out.println("Preço:" + p3.getPreco());
        System.out.println("Quantidade:" + p3.getQuantidade());

        System.out.println();

        System.out.println("Nome:" + p4.getNome());
        System.out.println("Preço:" + p4.getPreco());
        System.out.println("Quantidade:" + p4.getQuantidade());

        p3.aplicarDesconto(10);

        p3.aumentarQuantidade(20);

        p3.diminuirQuantidade(5);

        
        
    }
}


    
   