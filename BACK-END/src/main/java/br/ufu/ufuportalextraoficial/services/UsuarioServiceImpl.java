package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.User;
import br.ufu.ufuportalextraoficial.repository.UsuarioRepository;
//import br.ufu.ufuportalextraoficial.boot.model.User;
//import br.ufu.ufuportalextraoficial.boot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional()
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional(readOnly = true)
    @Override
    public List<User> buscarTodos() {
        return (List<User>) usuarioRepository.findAll();
    }

    @Override
    public void salvar(User user) {
        usuarioRepository.save(user);
    }

    @Override
    public void editar(User user) {
        usuarioRepository.save(user);
    }

//    @Override
//    public void atualizarSenha(Long id, String novaSenha) {
//        usuarioRepository.setUser(id, novaSenha);
//    }

    @Transactional(readOnly = true)
    @Override
    public User buscarPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public void excluir(Long id) {
        usuarioRepository.deleteById(id);
    }
}
