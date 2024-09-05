package ci.digitalacademy.cantine.repositories;

import ci.digitalacademy.cantine.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
