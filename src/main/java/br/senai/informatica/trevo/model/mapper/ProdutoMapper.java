package br.senai.informatica.trevo.model.mapper;

import br.senai.informatica.trevo.model.Cultura;
import br.senai.informatica.trevo.model.Produto;
import br.senai.informatica.trevo.model.ProdutoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    @Mappings({
        @Mapping(target = "area", source = "area.tamanho")
    })
    ProdutoDTO toProdutoDTO(Produto produto);

    default Set<String> map(Set<Cultura> culturas) {
        return culturas.stream()
            .map(Cultura::getNome)
            .collect(Collectors.toSet());
    }
}
