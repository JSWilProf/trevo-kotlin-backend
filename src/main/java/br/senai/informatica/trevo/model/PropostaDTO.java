package br.senai.informatica.trevo.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Set;

@Data
public class PropostaDTO {
    @NotNull(message = "O cliente não foi informado")
    @Valid
    private ClienteDTO cliente;
    @Size(min = 1, message = "O código do produto é obrigatório")
    @NotNull(message = "O código do produto é obrigatório")
    private Set<Long> produtos;
}
