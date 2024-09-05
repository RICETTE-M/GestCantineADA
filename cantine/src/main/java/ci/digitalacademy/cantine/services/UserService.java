package ci.digitalacademy.cantine.services;

import ci.digitalacademy.cantine.models.Plat;
import ci.digitalacademy.cantine.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);//create
    List<User> findAll();//read

    User update(User user); //update

    void deleteById(Long id);

    Optional<User> findOne(Long id);
}
