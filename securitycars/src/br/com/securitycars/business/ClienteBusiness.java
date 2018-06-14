/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.business;

import br.com.securitycars.business.interfaces.ClienteInterface;
import br.com.securitycars.dominio.Cliente;
import br.com.securitycars.repositorio.Repositorio;
import java.util.List;


public class ClienteBusiness implements ClienteInterface{

    @Override
    public Cliente salvarCliente(Cliente cliente) {
        if(validarCliente(cliente)){
           Repositorio.clienteDBFake.add(cliente);  
            System.out.println("Cliente cadastrado!");
        }else{
            System.err.println("Cliente com dados inválido");
        }
        return null;
    }

    @Override
    public Cliente buscarClientePorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> buscarClientePorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> buscarTodosClienteS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean validarCliente(Cliente cliente){
        boolean clienteValido=false;
        if(cliente !=null){
            if(   (cliente.getNome()!=null && 
                   !cliente.getNome().equals("")
                && (cliente.getSobrenome()!=null &&
                    !cliente.getSobrenome().equals("")))){
                clienteValido= true;
            }
        }        
        return clienteValido;
    }
    
    public boolean validarCliente2(Cliente cliente){
        boolean clienteValido=true;
        if(cliente !=null){
            if(cliente.getNome()==null ||
               cliente.getNome().equals("")){
                clienteValido= false;
            }
            if(cliente.getSobrenome()==null ||
                cliente.getSobrenome().equals("")){
                clienteValido= false;
            }           
        }        
        return clienteValido;
    }
    
}
