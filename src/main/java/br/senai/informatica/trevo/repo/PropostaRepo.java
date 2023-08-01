package br.senai.informatica.trevo.repo;

import br.senai.informatica.trevo.model.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepo extends JpaRepository<Proposta, Long> {
}
