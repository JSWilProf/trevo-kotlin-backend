package br.senai.informatica.trevo.model.mapper;

import br.senai.informatica.trevo.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    @Mapping(target = "idCliente", ignore = true)
    Cliente toCliente(ClienteDTO clienteDTO);

    ClienteDTO toClienteDTO(Cliente cliente);
}
