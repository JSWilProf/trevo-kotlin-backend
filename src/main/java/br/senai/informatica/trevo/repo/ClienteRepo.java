package br.senai.informatica.trevo.repo;

import br.senai.informatica.trevo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
}
