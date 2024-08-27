package group.java.repos;

import group.java.domain.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
}
