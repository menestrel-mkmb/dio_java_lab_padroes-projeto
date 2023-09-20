package edu.example.springprojectpattern.model;

import edu.example.springprojectpattern.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
