package ci.digitalacademy.cantine.services;

import ci.digitalacademy.cantine.models.Plat;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    Plat save(Plat plat);//create
    List<Plat> findAll();//read

    Plat update(Plat plat); //update

    void deleteById(Long id);

    Optional<Plat> findOne(Long id);
}
