package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.Vaga;
//import br.ufu.ufuportalextraoficial.boot.model.Vaga;

import java.util.List;

public interface VagaService {
    void salvar(Vaga vaga);

    void editar(Vaga vaga);

    void excluir(Long id);

    Vaga buscarPorId(Long id);

    List<Vaga> buscarTodos();
}
