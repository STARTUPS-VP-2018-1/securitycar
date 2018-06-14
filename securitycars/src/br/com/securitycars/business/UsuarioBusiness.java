/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.business;

import br.com.securitycars.business.interfaces.UsuarioInterface;
import br.com.securitycars.dominio.Cliente;
import br.com.securitycars.dominio.Usuario;
import br.com.securitycars.repositorio.Repositorio;

/**
 *
 * @author uellinton
 */
public class UsuarioBusiness implements UsuarioInterface {

    @Override
    public boolean cadastrarUsuario(String login, String senha, String confirmarSenha, String email) {
     
        boolean usuarioValido=false;
        
            if(login ==null ||!login.equals("") || senha == null||!senha.equals("")){
                usuarioValido = true;
            }        
        return usuarioValido;    
    }

}
