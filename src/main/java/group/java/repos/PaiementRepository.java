package group.java.repos;

import group.java.domain.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaiementRepository extends JpaRepository<Paiement, Integer> {
}
