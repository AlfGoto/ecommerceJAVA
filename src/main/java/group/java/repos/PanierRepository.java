package group.java.repos;

import group.java.domain.Panier;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PanierRepository extends JpaRepository<Panier, Integer> {
}
