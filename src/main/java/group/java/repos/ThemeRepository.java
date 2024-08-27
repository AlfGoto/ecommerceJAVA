package group.java.repos;

import group.java.domain.Theme;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ThemeRepository extends JpaRepository<Theme, Integer> {
}
