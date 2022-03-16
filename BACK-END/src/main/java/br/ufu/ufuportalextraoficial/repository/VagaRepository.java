package br.ufu.ufuportalextraoficial.repository;

import br.ufu.ufuportalextraoficial.models.Vaga;
//import br.ufu.ufuportalextraoficial.boot.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
//    @Query("update VAGA v set v.password = :password WHERE v.id = :vagaId")
//    void setVaga(@Param("vagaId") Long id, @Param("name") String name);
}
