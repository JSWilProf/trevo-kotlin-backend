package br.senai.informatica.trevo.repo;

import br.senai.informatica.trevo.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepo extends JpaRepository<Produto, Long> {
    @Query("select p from Produto p where lower(p.nome) like lower(:pesquisa)")
    Page<Produto> findAllByNome(@Param("pesquisa") String pesquisa, Pageable pageable);
}
