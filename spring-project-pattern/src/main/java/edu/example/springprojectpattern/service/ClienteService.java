package edu.example.springprojectpattern.service;

import edu.example.springprojectpattern.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements ClienteServiceInterface {
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}