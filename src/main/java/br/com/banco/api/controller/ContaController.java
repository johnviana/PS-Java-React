package br.com.banco.api.controller;

import br.com.banco.domain.model.Conta;
import br.com.banco.domain.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/contas")
public class ContaController {


    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> listarConta(){
        List<Conta> contas = contaService.listarConta();
        return ResponseEntity.ok(contas);
    }

    @GetMapping("/{id}")
    public Conta buscarConta(@PathVariable Long id){
        Conta conta = contaService.buscarOuFalhar(id);
        return conta;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conta salvar(@RequestBody Conta conta){
        return contaService.salvar(conta);
    }

}
