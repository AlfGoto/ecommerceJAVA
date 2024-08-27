package group.java.repos;

import group.java.domain.Commandes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommandesRepository extends JpaRepository<Commandes, Integer> {
}
