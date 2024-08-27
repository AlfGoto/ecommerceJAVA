package group.java.repos;

import group.java.domain.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<Produit, Integer> {
}
