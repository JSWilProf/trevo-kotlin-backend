package br.senai.informatica.trevo.service;

import br.senai.informatica.trevo.components.DataException;
import br.senai.informatica.trevo.components.DataInvalidException;
import br.senai.informatica.trevo.model.*;
import br.senai.informatica.trevo.model.mapper.ClienteMapper;
import br.senai.informatica.trevo.model.mapper.PropostaMapper;
import br.senai.informatica.trevo.repo.ClienteRepo;
import br.senai.informatica.trevo.repo.ProdutoRepo;
import br.senai.informatica.trevo.repo.PropostaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.HashSet;

@Service
public class PropostaService {
    @Autowired
    private PropostaRepo repo;
    @Autowired
    private ProdutoRepo produtoRepo;
    @Autowired
    private PropostaMapper mapper;
    @Autowired
    private ClienteRepo clienteRepo;
    @Autowired
    private ClienteMapper clienteMapper;

    @Transactional
    public PropostaOutDTO salvar(PropostaDTO obj) throws DataException {
        var proposta = mapper.toProposta(obj);
        var produtos = new HashSet<Produto>();

        var umCliente = Example.of(
            Cliente.builder().email(
                obj.getCliente().getEmail()).build());

        clienteRepo.findOne(umCliente).ifPresent(proposta::setCliente);

        for (var idProduto : obj.getProdutos()) {
            produtoRepo.findById(idProduto).ifPresent(produtos::add);
        }

        if(!produtos.isEmpty()) {
            proposta.setProdutos(produtos);
        } else {
            throw new DataInvalidException("A Proposta deve conter pelo menos um Produto");
        }

        proposta.setData(LocalDate.now());

        return mapper.toPropostaOutDTO(repo.save(proposta));
    }

    public Page<PropostaOutDTO> listar(String email, Integer pageNo, Integer pageSize, String sortBy) {
        var paging = PageRequest.of(pageNo,pageSize, Sort.by(sortBy));

        return repo.findAll(Example.of(
            Proposta.builder().cliente(
                Cliente.builder().email(email).build())
                .build()), paging)
            .map(mapper::toPropostaOutDTO);
    }
}
