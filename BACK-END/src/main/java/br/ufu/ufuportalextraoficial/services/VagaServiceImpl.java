package br.ufu.ufuportalextraoficial.services;

//import br.ufu.ufuportalextraoficial.boot.model.Vaga;
//import br.ufu.ufuportalextraoficial.boot.repository.VagaRepository;
import br.ufu.ufuportalextraoficial.models.Vaga;
import br.ufu.ufuportalextraoficial.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaServiceImpl implements VagaService {

    @Autowired
    private VagaRepository repo;

    @Override
    public void salvar(Vaga vaga) {
        repo.save(vaga);
    }

    @Override
    public void editar(Vaga vaga) {
        repo.save(vaga);
    }

    @Override
    public void excluir(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Vaga buscarPorId(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Vaga> buscarTodos() {
        return repo.findAll();
    }
}
