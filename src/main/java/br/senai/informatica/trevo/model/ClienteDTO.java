package br.senai.informatica.trevo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ClienteDTO {
    @NotEmpty(message = "O nome é obrigatório")
    private String nome;
    @Email(message = "O e-mail é inválido")
    @NotEmpty(message = "O e-mail é obrigatório")
    private String email;
    @Pattern(regexp = "(\\([1-9][0-9]\\) )?9?[0-9]{4}-[0-9]{4}", message = "O nº do telefone é inválido")
    @NotEmpty(message = "O telefone é obrigatório")
    private String telefone;
}
