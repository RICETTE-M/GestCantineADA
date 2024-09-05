package ci.digitalacademy.cantine.repositories;

import ci.digitalacademy.cantine.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{
}
