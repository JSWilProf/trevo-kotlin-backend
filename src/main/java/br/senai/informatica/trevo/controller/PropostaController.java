package br.senai.informatica.trevo.controller;

import br.senai.informatica.trevo.components.DataException;
import br.senai.informatica.trevo.components.DataValidationException;
import br.senai.informatica.trevo.model.PropostaDTO;
import br.senai.informatica.trevo.model.PropostaOutDTO;
import br.senai.informatica.trevo.service.PropostaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = "application/json;charset=utf-8")
public class PropostaController {
    @Autowired
    private PropostaService service;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Operation(summary = "Grava nova Proposta")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Proposta criada",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = PropostaOutDTO.class)) }),
        @ApiResponse(responseCode = "422", description = "Proposta com dados inválidos",
            content = @Content),
        @ApiResponse(responseCode = "404", description = "Produto não encontrado",
            content = @Content) })
    @Transactional
    @PostMapping("/proposta")
    public ResponseEntity<PropostaOutDTO> incluir(@RequestBody @Valid PropostaDTO proposta, BindingResult result) throws DataException {
        logger.error("Proposta: " + proposta.toString());
        if(result.hasErrors()) {
            throw new DataValidationException("Proposta com dados inválidos", result);
        } else {
            return ResponseEntity.ok(service.salvar(proposta));
        }
    }

    @Operation(summary = "Gera uma lista de todas as Propostas paginados")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Propostas encontradas",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = PropostaOutDTO.class)) }) })
    @GetMapping("/propostas")
    public ResponseEntity<Page<PropostaOutDTO>> listar(String email,
        @RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize,
        @RequestParam(defaultValue = "data") String sortBy) throws DataException {
        var lista = service.listar(email, pageNo, pageSize, sortBy);
        logger.trace("Page Total de Propostas: " + lista.getTotalElements());
        return ResponseEntity.ok(lista);
    }
}
