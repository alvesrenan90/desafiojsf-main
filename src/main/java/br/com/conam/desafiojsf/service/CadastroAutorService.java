package br.com.conam.desafiojsf.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.conam.desafiojsf.entity.Autor;
import br.com.conam.desafiojsf.repository.Autores;
import br.com.conam.desafiojsf.util.Transacional;

public class CadastroAutorService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Autores autores;

    @Transacional
    public void salvar(Autor autor) {
        autores.guardar(autor);
    }

    @Transacional
    public void excluir(Autor autor) {
        autores.remover(autor);
    }

}