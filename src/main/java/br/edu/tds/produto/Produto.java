/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.produto;

/**
 *
 * @author aluno
 */
public class Produto {

    private String nome;
    private float preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void aplicarDesconto(float percentual) {
       float novoPreco = preco - (preco * percentual / 100);
        System.out.println("Preço com desconto: " + novoPreco);
    }

    public void aumentarQuantidade(int valor) {
        quantidade += valor;
    }

    public void diminuirQuantidade(int valor) {
        if(valor > quantidade){
            System.out.println("Não é possível retirar essa quantidade");
        }
        else{
            quantidade -= valor;
        }
    }
}