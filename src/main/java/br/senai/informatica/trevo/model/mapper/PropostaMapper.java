package br.senai.informatica.trevo.model.mapper;

import br.senai.informatica.trevo.model.Produto;
import br.senai.informatica.trevo.model.Proposta;
import br.senai.informatica.trevo.model.PropostaDTO;
import br.senai.informatica.trevo.model.PropostaOutDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PropostaMapper {
    @Mappings({
        @Mapping(target = "idProposta", ignore = true),
        @Mapping(target = "produtos", ignore = true),
        @Mapping(target = "data", ignore = true),
        @Mapping(target = "cliente.idCliente", ignore = true)
    })
    Proposta toProposta(PropostaDTO propostaDTO);

    @Mappings({
        @Mapping(target = "produtos", qualifiedByName = "mapToIdProduto"),
        @Mapping(target = "data", dateFormat = "dd-MM-yyyy")
    })
    PropostaOutDTO toPropostaOutDTO(Proposta proposta);

    @Named("mapToIdProduto")
    default Set<Long> mapToCulturas(Set<Produto> produtos) {
        return produtos.stream().map(Produto::getIdProduto)
            .collect(Collectors.toSet());
    }
}
