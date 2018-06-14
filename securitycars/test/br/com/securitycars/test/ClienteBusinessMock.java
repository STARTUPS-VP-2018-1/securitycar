/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.test;

import br.com.securitycars.business.ClienteBusiness;
import br.com.securitycars.dominio.Cliente;
import java.util.ArrayList;

/**
 *
 * @author internet
 */
public class ClienteBusinessMock {
    
    public static void main(String[] args){
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Carlos");
        novoCliente.setSobrenome("Henrique");
        
        novoCliente.setTelefones(new ArrayList<Integer>());
        novoCliente.getTelefones().add(954029668);
        novoCliente.getTelefones().add(935648551);
        novoCliente.getTelefones().add(40072152);
        
        ClienteBusiness clienteBusiness = new ClienteBusiness(); 
        
        Cliente segundoNovoCliente = null;
        try{
            clienteBusiness.salvarCliente(novoCliente);
            clienteBusiness.salvarCliente(segundoNovoCliente);
        }catch(UnsupportedOperationException exc){
            System.out.println(exc.getMessage());
        }        
                
    }    
}
