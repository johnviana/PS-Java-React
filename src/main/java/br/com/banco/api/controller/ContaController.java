package br.com.banco.api.controller;

import br.com.banco.domain.model.Conta;
import br.com.banco.domain.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/contas")
public class ContaController {


    @Autowired
    private ContaService contaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conta salvar(@RequestBody Conta conta){
        return contaService.salvar(conta);
    }

}