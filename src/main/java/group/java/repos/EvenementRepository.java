package group.java.repos;

import group.java.domain.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
}
