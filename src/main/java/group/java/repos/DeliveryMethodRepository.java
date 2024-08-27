package group.java.repos;

import group.java.domain.DeliveryMethod;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeliveryMethodRepository extends JpaRepository<DeliveryMethod, Integer> {
}
