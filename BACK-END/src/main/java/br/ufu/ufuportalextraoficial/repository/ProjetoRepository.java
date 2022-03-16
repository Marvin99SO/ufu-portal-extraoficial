package br.ufu.ufuportalextraoficial.repository;

import br.ufu.ufuportalextraoficial.models.Projeto;
//import br.ufu.ufuportalextraoficial.boot.model.Projeto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Long> {}
