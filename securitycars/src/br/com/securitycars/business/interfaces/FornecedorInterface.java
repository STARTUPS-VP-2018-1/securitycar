/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.securitycars.business.interfaces;

import br.com.securitycars.dominio.Fornecedor;
import java.util.List;

/**
 *
 * @author internet
 */
public interface FornecedorInterface {
    
    public Fornecedor salvarFornecedor(Fornecedor fornecedor);
    
    public Fornecedor buscarFornecedorPorId(Integer id);
    
    public List<Fornecedor> buscarFornecedorPorNome(String nome);
    
    public List<Fornecedor> buscarTodosFornecedores();
}
