package edu.example.springprojectpattern.service;

import edu.example.springprojectpattern.model.Cliente;

/*
*
* Interface que define o padrão no domínio de Cliente.
*
* Strategy é o padrão de projeto que determina o tipo de comportamento.
*
* */

public interface ClienteServiceInterface {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
