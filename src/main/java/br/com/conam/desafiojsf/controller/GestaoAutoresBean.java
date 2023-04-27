package br.com.conam.desafiojsf.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.convert.Converter;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import br.com.conam.desafiojsf.entity.Autor;
import br.com.conam.desafiojsf.entity.Obra;
import br.com.conam.desafiojsf.entity.PaisOrigem;
import br.com.conam.desafiojsf.repository.Autores;
import br.com.conam.desafiojsf.repository.Obras;
import br.com.conam.desafiojsf.service.CadastroAutorService;
import br.com.conam.desafiojsf.util.FacesMessages;

@Named
@ViewScoped
public class GestaoAutoresBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private Autores autores;
    
    @Inject
    private FacesMessages messages;
    
    @Inject
    private Obras obras;
    
    @Inject
    private CadastroAutorService cadastroAutorService;
    
    private List<Autor> listaAutores;
    
    private String termoPesquisa;
    
    private Converter obraConverter;
    
    private Autor autor;
    
    public void prepararNovaAutor() {
        autor = new Autor();
    }
    
    public void salvar() {
        cadastroAutorService.salvar(autor);
        
        if (jaHouvePesquisa()) {
            pesquisar();
        } else {
            todasAutores();
        }
        
        messages.info("Autor salvo com sucesso!");
        
        RequestContext.getCurrentInstance().update(Arrays.asList(
                "frm:autoresDataTable", "frm:messages"));
    }
    
    public void pesquisar() {
        listaAutores = autores.pesquisar(termoPesquisa);
        
        if (listaAutores.isEmpty()) {
            messages.info("Sua consulta não retornou registros.");
        }
    }
    
    public void todasAutores() {
        listaAutores = autores.todas();
    }
    
    public List<Obra> completarObra(String termo) {
        List<Obra> listaObras = obras.pesquisar(termo);
        
        obraConverter = new ObraConverter(listaObras);
        
        return listaObras;
    }
    
    private boolean jaHouvePesquisa() {
        return termoPesquisa != null && !"".equals(termoPesquisa);
    }
    
    public List<Autor> getListaAutores() {
        return listaAutores;
    }
    
    public String getTermoPesquisa() {
        return termoPesquisa;
    }
    
    public void setTermoPesquisa(String termoPesquisa) {
        this.termoPesquisa = termoPesquisa;
    }    
    
    public PaisOrigem[] getPaisOrigems() {
        return PaisOrigem.values();
    }
    
    public Converter getObraConverter() {
        return obraConverter;
    }
    
    public Autor getAutor() {
        return autor;
    }
}