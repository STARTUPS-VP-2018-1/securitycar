/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.business;

import br.com.securitycars.business.interfaces.LoginInterface;
import br.com.securitycars.dominio.Cliente;
import br.com.securitycars.dominio.Fornecedor;
import br.com.securitycars.dominio.Usuario;
import br.com.securitycars.repositorio.Repositorio;

/**
 *
 * @author internet
 */
public class LoginBusiness implements LoginInterface{

    @Override
    public boolean validaUsuario(Usuario usuario) {
        
        if (Repositorio.clienteDBFake.stream().anyMatch((cliente) -> (cliente.getNomeUsuario().
                equals(usuario.getNomeUsuario()) &&
                cliente.getSenha().equals(cliente.getSenha())))) {
            return true;   
        }
        
        return Repositorio.fornecedorDBFake.stream().anyMatch((fornecedor) -> (fornecedor.getNomeUsuario().
                equals(usuario.getNomeUsuario()) &&
                fornecedor.getSenha().equals(usuario.getSenha())));
    }

    @Override
    public Usuario validaUsuario(String nomeUsuario, String senha) {
        Usuario usuario = null;
        
        for(Cliente cliente: Repositorio.clienteDBFake){
            if(cliente.getNomeUsuario().
                    equals(nomeUsuario) &&
               cliente.getSenha().equals(senha)){
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);
                usuario.setFornecedor(false);
                        
            }   
        }        
        for(Fornecedor fornecedor:Repositorio.fornecedorDBFake){
            if(fornecedor.getNomeUsuario().
                    equals(nomeUsuario) &&
                fornecedor.getSenha().equals(senha)){
                
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);
                usuario.setFornecedor(true);                
            }
        }        
        return usuario;
    }
    
}








