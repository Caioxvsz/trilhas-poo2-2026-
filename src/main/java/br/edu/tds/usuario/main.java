/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.usuario;

/**
 *
 * @author aluno
 */
public class main {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
        
        
        
        Usuario ul = new Usuario("Carlos","carlos@email.com","1234");
        dao.cadastrar(ul);
        //boolean acesso = dao.login("carlos@email.com", "1234");
        
        
        
        Usuario u2 = new Usuario("Douglas","douglas@email.com","12345");
        dao.cadastrar(u2);

        boolean acesso = dao.login("douglas@email.com", "12345");
        
        
        
        Usuario u3 = new Usuario("Julia","julia@email.com","123456");
        dao.cadastrar(u3);

       //boolean acesso = dao.login("ulia@email.com", "123456");
        
       
       
        Usuario u4 = new Usuario("Lucas","lucassurreal@email.com","1234567");
        dao.cadastrar(u4);

        //boolean acesso = dao.login("lucassurreal@email.com", "1234567");
        
        
        Usuario u5 = new Usuario("Juan","juan@email.com","12345678");
        dao.cadastrar(u5);

        //boolean acesso = dao.login("juan@email.com", "12345678");

        
       if (acesso) {
           System.out.println("Login realizado com sucesso!");
       } else {
           System.out.println("Email ou senha inválidos!");
       }
   }

        
        
        
  }
