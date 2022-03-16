package br.ufu.ufuportalextraoficial.services;

//import br.ufu.ufuportalextraoficial.boot.model.Classificado;

import br.ufu.ufuportalextraoficial.models.Classificado;

import java.util.List;

public interface ClassificadoService {
    void salvar(Classificado classificado);

    void editar(Classificado classificado);

    void excluir(Long id);

    Classificado buscarPorId(Long id);

    List<Classificado> buscarTodos();
}
