package br.ufu.ufuportalextraoficial.services;

//import br.ufu.ufuportalextraoficial.boot.model.Classificado;
//import br.ufu.ufuportalextraoficial.boot.repository.ClassificadoRepository;
import br.ufu.ufuportalextraoficial.models.Classificado;
import br.ufu.ufuportalextraoficial.repository.ClassificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificadoServiceImpl implements ClassificadoService{
    @Autowired
    private ClassificadoRepository repo;

    @Override
    public void salvar(Classificado classificado) {
        repo.save(classificado);
    }

    @Override
    public void editar(Classificado classificado) {
        repo.save(classificado);
    }

    @Override
    public void excluir(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Classificado buscarPorId(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Classificado> buscarTodos() {
        return (List<Classificado>) repo.findAll();
    }
}
