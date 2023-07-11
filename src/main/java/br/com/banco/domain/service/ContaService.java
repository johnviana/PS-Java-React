package br.com.banco.domain.service;

import br.com.banco.domain.model.Conta;
import br.com.banco.domain.repository.ContaRepopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepopsitory contaRepopsitory;

    public List<Conta> listarContra(){
        return  contaRepopsitory.findAll();
    }

    public Conta salvar(Conta conta){
        return contaRepopsitory.save(conta);
    }
}
