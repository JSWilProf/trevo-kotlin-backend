package br.senai.informatica.trevo.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class PropostaOutDTO {
    private Long idProposta;
    private String data;
    private ClienteDTO cliente;
    private Set<Long> produtos;
}
