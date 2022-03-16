package br.ufu.ufuportalextraoficial.services;

import br.ufu.ufuportalextraoficial.models.Projeto;
import br.ufu.ufuportalextraoficial.repository.ProjetoRepository;
//import br.ufu.ufuportalextraoficial.boot.model.Projeto;
//import br.ufu.ufuportalextraoficial.boot.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoServiceImpl implements ProjetoService{
    @Autowired
    private ProjetoRepository repo;

    @Override
    public void salvar(Projeto projeto) {
        repo.save(projeto);
    }

    @Override
    public void editar(Projeto projeto) {
        repo.save(projeto);
    }

    @Override
    public void excluir(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Projeto buscarPorId(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Projeto> buscarTodos() {
        return (List<Projeto>) repo.findAll();
    }
}

