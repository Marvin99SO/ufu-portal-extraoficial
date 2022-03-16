package br.ufu.ufuportalextraoficial.repository;

import br.ufu.ufuportalextraoficial.models.User;
//import br.ufu.ufuportalextraoficial.boot.model.User;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface UsuarioRepository extends CrudRepository<User, Long> {
//    @Query("update USER u set u.password = :password WHERE u.id = :userId")
//    void setUser(@Param("userId") Long id, @Param("password") String password);
}
