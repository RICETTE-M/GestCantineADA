package ci.digitalacademy.cantine.services.impl;

import ci.digitalacademy.cantine.models.Menu;
import ci.digitalacademy.cantine.repositories.MenuRepository;
import ci.digitalacademy.cantine.services.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Override
    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public Menu update(Menu menu) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        menuRepository.deleteById(id);

    }

    @Override
    public Optional<Menu> findOne(Long id) {
        return menuRepository.findById(id);
    }
}
