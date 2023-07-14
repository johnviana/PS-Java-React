package br.com.banco.domain.exception;

/**
 * @author johnv
 */

public class ContaNaoEncontradaException extends EntidadeNaoEncontradaException{

    public ContaNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
