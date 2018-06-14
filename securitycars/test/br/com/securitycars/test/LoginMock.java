/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.test;

import br.com.securitycars.business.LoginBusiness;
import br.com.securitycars.business.interfaces.LoginInterface;
import br.com.securitycars.dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class LoginMock {
    
    public static void main(String agrs[]){
        
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNomeUsuario("Carlos");
        novoUsuario.setSenha("Barros");
        novoUsuario.setFornecedor(true);
        
        LoginInterface loginBusiness = new LoginBusiness();
        
        if(loginBusiness.validaUsuario(novoUsuario)){
            JOptionPane.showMessageDialog(null, "Bem vindo!");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario Não encontrado");
        }
                
        
        Usuario segundoUsuario = 
                loginBusiness.validaUsuario(
                        novoUsuario.getNomeUsuario(), 
                        novoUsuario.getSenha());
                
        if(segundoUsuario != null){
            JOptionPane.showMessageDialog(null, "Bem vindo!");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario Não encontrado");
        }
                    
        
        
        
        
                
                
                
                
                
                
                
                
                
                
                
                
    }
}




