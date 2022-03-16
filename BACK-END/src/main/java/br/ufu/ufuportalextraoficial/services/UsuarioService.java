package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.User;
//import br.ufu.ufuportalextraoficial.boot.model.User;

import java.util.List;

public interface UsuarioService {
    void salvar(User user);

    void editar(User user);

//    void atualizarSenha(Long id, String novaSenha);

    void excluir(Long id);

    User buscarPorId(Long id);

    List<User> buscarTodos();
}
