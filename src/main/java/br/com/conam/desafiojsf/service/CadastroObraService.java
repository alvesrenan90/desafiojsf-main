package br.com.conam.desafiojsf.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.conam.desafiojsf.entity.Obra;
import br.com.conam.desafiojsf.repository.Obras;
import br.com.conam.desafiojsf.util.Transacional;

public class CadastroObraService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Obras obras;

    @Transacional
    public void salvar(Obra obra) {
        obras.guardar(obra);
    }

    @Transacional
    public void excluir(Obra obra) {
        obras.remover(obra);
    }

}