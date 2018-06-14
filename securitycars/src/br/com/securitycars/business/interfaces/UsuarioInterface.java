package br.com.securitycars.business.interfaces;

import br.com.securitycars.dominio.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uellinton
 */
public interface UsuarioInterface {
    public boolean cadastrarUsuario(String login, String senha, String confirmarSenha, String email);
}
