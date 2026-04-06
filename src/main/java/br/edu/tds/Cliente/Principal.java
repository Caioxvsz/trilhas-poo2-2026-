/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Cliente;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args){
        System.out.println("Testando objetos da classe cliente");
        //Usando a classe Cliente
        
        Cliente c1 = new Cliente("Davi",19,"123456789");
        c1.imprimeDadosCliente();
        
        Cliente c2 = new Cliente("Douglas",31,"98456789");
        c2.imprimeDadosCliente();
        
        Cliente c3 = new Cliente("Robinho",67,"78832789");
        c3.imprimeDadosCliente();
        
        Cliente c4 = new Cliente();
        c4.setNome("Amaral");
        c4.setCpf("99999999");
        c4.setIdade(88);
        c4.imprimeDadosCliente();
        
        //Imprimir somente o nome de um cliente
        //Usando métodos Get 
        
        String nome = c4.getNome();
        System.out.println("Nome obtido pelo get:"+ nome);
    }
}
