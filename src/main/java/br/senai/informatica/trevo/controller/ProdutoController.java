package br.senai.informatica.trevo.controller;

import br.senai.informatica.trevo.components.DataException;
import br.senai.informatica.trevo.components.DataNotFoundException;
import br.senai.informatica.trevo.model.ProdutoDTO;
import br.senai.informatica.trevo.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.stream.Collectors;

// Todo: Implementar Pesquisa por Nome

@RestController
@RequestMapping(path = "/api", produces = "application/json;charset=utf-8")
public class ProdutoController {
    @Autowired
    private ProdutoService service;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Operation(summary = "Gera uma lista de todos os Produtos paginados")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Produtos encontrados",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = ProdutoDTO.class)) }) })
    @GetMapping("/produtos")
    public ResponseEntity<Page<ProdutoDTO>> listar(
        @RequestParam(defaultValue = "") String pesquisa,
        @RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize,
        @RequestParam(defaultValue = "nome") String sortBy) throws DataException {
        var lista = service.listar(pesquisa, pageNo, pageSize, sortBy);
        logger.error(
            "Nº Total de Produtos: " + lista.getTotalElements() +
            " Quantidade de Produtos: " + lista.getNumberOfElements() +
            " Nº Total de Página: " + lista.getTotalPages() +
            " Nº da página: " + lista.getNumber()
        );
        logger.error("\n" + lista.getContent().stream().map(produto ->
            String.format("Nome: %s Mais Vendido: %s\n", produto.getNome(), produto.isMaisVendido())
        ).collect(Collectors.joining()));
        return ResponseEntity.ok(lista);
    }

    @Operation(summary = "Localiza um Produto por ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Produto encontrado",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = ProdutoDTO.class)) }),
        @ApiResponse(responseCode = "404", description = "Produto não encontrado",
            content = @Content) })
    @GetMapping("/produto/{id}")
    public ResponseEntity<ProdutoDTO> localizar(@PathVariable("id") Long id) throws DataException {
        var produto = service.localizar(id);

        if(produto.isPresent()) {
            logger.error("Produto: " + produto.get().getNome());
            return ResponseEntity.ok(produto.get());
        } else {
            logger.error("Produto: Não encontrado");
            throw new DataNotFoundException("Produto não encontrado");
        }
    }

    @Operation(summary = "Localiza a Foto de um Produto pelo nome da imagem")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Foto encontrada",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = ProdutoDTO.class)) }),
        @ApiResponse(responseCode = "404", description = "Imagem não encontrada",
            content = @Content) })
    @GetMapping("/produto/foto/{foto}")
    @ResponseBody
    public ResponseEntity<InputStreamResource> getImage(@PathVariable("foto") String foto) throws DataException {
        InputStream in = getClass().getResourceAsStream("/images/" + foto);
        if(in != null) {
            return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(in));
        } else {
            throw new DataNotFoundException("Imagem não encontrada");
        }
    }

    @Operation(summary = "Localiza a Capa de um Produto pelo nome da imagem")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Capa encontrada",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = ProdutoDTO.class)) }),
        @ApiResponse(responseCode = "404", description = "Imagem não encontrada",
            content = @Content) })
    @GetMapping("/produto/capa/{capa}")
    @ResponseBody
    public ResponseEntity<InputStreamResource> getCapa(@PathVariable("capa") String capa) throws DataException {
        InputStream in = getClass().getResourceAsStream("/images/" + capa);
        if(in != null) {
            return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(in));
        } else {
            throw new DataNotFoundException("Capa não encontrada");
        }
    }
}
