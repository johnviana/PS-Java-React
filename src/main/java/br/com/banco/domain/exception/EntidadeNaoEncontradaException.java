package br.com.banco.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * @author johnv
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntidadeNaoEncontradaException extends  NegocioException{

    public EntidadeNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
