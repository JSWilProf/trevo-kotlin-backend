package br.senai.informatica.trevo.service;

import br.senai.informatica.trevo.model.ProdutoDTO;
import br.senai.informatica.trevo.model.mapper.ProdutoMapper;
import br.senai.informatica.trevo.repo.ProdutoRepo;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepo repo;
    @Autowired
    private ProdutoMapper mapper;

    public Page<ProdutoDTO> listar(String pesquisa, Integer pageNo, Integer pageSize, String sortBy) {
        var paging = PageRequest.of(pageNo,pageSize, Sort.by(sortBy));

        if(pesquisa.isBlank()) {
            return repo.findAll(paging).map(mapper::toProdutoDTO);
        } else {
            return repo.findAllByNome("%" + pesquisa + "%", paging).map(mapper::toProdutoDTO);
        }
    }

    public Optional<ProdutoDTO> localizar(long idProduto) {
        return repo.findById(idProduto).map(mapper::toProdutoDTO);
    }
}
