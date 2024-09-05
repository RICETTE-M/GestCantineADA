package ci.digitalacademy.cantine.services;


import ci.digitalacademy.cantine.models.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {

    Menu save(Menu menu);//create
    List<Menu> findAll();//read

    Menu update(Menu menu); //update

    void deleteById(Long id);

    Optional<Menu> findOne(Long id);
}
