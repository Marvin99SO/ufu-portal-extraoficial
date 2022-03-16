package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.Noticia;
//import br.ufu.ufuportalextraoficial.boot.model.Noticia;

import java.util.List;

public interface NoticiaService {
    void salvar(Noticia noticia);

    void editar(Noticia noticia);

    void excluir(Long id);

    Noticia buscarPorId(Long id);

    List<Noticia> buscarTodos();
}
