package group.java.repos;

import group.java.domain.Adresses;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdressesRepository extends JpaRepository<Adresses, Integer> {
}
