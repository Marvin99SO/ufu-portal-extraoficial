package br.ufu.ufuportalextraoficial.repository;

import br.ufu.ufuportalextraoficial.models.Classificado;
//import br.ufu.ufuportalextraoficial.boot.model.Classificado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificadoRepository extends CrudRepository<Classificado, Long> {}
