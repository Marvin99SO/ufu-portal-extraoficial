package br.ufu.ufuportalextraoficial.repository;

import br.ufu.ufuportalextraoficial.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
