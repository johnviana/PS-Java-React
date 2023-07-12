package br.com.banco.api.controller;

import br.com.banco.domain.model.Transferencia;
import br.com.banco.domain.service.ContaService;
import br.com.banco.domain.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Transferencia>> getTranfesrencia(){
        List<Transferencia> transferencias = transferenciaService.listaTransferencia();
        return ResponseEntity.ok(transferencias);
    }

    @GetMapping("/{id}")
    public Transferencia transferenciaId(@PathVariable Long id){
        Transferencia transferencias = transferenciaService.buscarOuFalhar(id);
        return transferencias;
        }

    }



