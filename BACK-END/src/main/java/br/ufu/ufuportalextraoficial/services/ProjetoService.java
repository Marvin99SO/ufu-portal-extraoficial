package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.Projeto;
//import br.ufu.ufuportalextraoficial.boot.model.Projeto;

import java.util.List;

public interface ProjetoService {
    void salvar(Projeto projeto);

    void editar(Projeto projeto);

    void excluir(Long id);

    Projeto buscarPorId(Long id);

    List<Projeto> buscarTodos();
}
