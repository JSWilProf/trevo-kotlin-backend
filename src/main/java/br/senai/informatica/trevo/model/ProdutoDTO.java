package br.senai.informatica.trevo.model;

import lombok.Data;

import java.util.Set;

@Data
public class ProdutoDTO {
    private Long idProduto;
    private String nome;
    private String descricao;
    private String area;
    private String imagem;
    private String capa;
    private boolean maisVendido;
    private Set<String> culturas;
}
