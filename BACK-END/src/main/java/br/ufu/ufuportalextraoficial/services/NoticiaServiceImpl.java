package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.Noticia;
import br.ufu.ufuportalextraoficial.repository.NoticiaRepository;
//import br.ufu.ufuportalextraoficial.boot.model.Noticia;
//import br.ufu.ufuportalextraoficial.boot.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaServiceImpl implements NoticiaService {
    @Autowired
    private NoticiaRepository repo;

    @Override
    public List<Noticia> buscarTodos() {
        return repo.findAll();
    }

    @Override
    public void salvar(Noticia noticia) {
        repo.save(noticia);
    }

    @Override
    public void editar(Noticia noticia) {
        repo.save(noticia);
    }

    @Override
    public Noticia buscarPorId(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public void excluir(Long id) {
        repo.deleteById(id);
    }
}
