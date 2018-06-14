/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.repositorio;

import br.com.securitycars.dominio.Cliente;
import br.com.securitycars.dominio.Fornecedor;
import br.com.securitycars.dominio.Produto;
import br.com.securitycars.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {
    
    public static List<Produto> produtoDBFake = new ArrayList<Produto>();
    public static List<Cliente> clienteDBFake = new ArrayList<Cliente>();
    public static List<Fornecedor> fornecedorDBFake = new ArrayList<Fornecedor>();
    public static List<Usuario> usuarioDBFake = new ArrayList<Usuario>();
    
}
