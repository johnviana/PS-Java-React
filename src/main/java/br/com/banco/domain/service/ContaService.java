package br.com.banco.domain.service;

import br.com.banco.domain.exception.ContaNaoEncontradaException;
import br.com.banco.domain.model.Conta;
import br.com.banco.domain.repository.ContaRepopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author johnv
 */


@Service
public class ContaService {

    @Autowired
    private ContaRepopsitory contaRepopsitory;

    public List<Conta> listarConta(){
        return  contaRepopsitory.findAll();
    }

    public Conta salvar(Conta conta){
        return contaRepopsitory.save(conta);
    }

    public Conta buscarOuFalhar(Long id){
        return contaRepopsitory.findById(id)
                .orElseThrow(() -> new ContaNaoEncontradaException(
                        String.format("Codigo da conta não encontrado %d", id)));

    }


}
