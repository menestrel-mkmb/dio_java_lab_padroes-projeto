package edu.example.springprojectpattern.service;

import edu.example.springprojectpattern.model.Cliente;
import edu.example.springprojectpattern.model.ClienteRepository;
import edu.example.springprojectpattern.model.Endereco;
import edu.example.springprojectpattern.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService implements ClienteServiceInterface {
    @Autowired
    private ClienteRepository clienteRepo;
    @Autowired
    private EnderecoRepository enderecoRepo;
    @Autowired
    private ViaCepServiceInterface viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepo.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteUpdate = clienteRepo.findById(id);
        if(clienteUpdate.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepo.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepo.findById(cep).orElseGet(() -> {
            Endereco enderecoConsultado = viaCepService.consultarCep(cep);
            enderecoRepo.save(enderecoConsultado);
            return enderecoConsultado;
        });

        cliente.setEndereco(endereco);
        clienteRepo.save(cliente);
    }
}