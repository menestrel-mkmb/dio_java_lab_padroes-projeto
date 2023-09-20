package edu.example.springprojectpattern.model;

import edu.example.springprojectpattern.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
