package br.ufu.ufuportalextraoficial.repository;

//import br.ufu.ufuportalextraoficial.boot.model.Noticia;
import br.ufu.ufuportalextraoficial.models.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {}
