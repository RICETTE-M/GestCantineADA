package ci.digitalacademy.cantine.services.impl;

import ci.digitalacademy.cantine.models.User;
import ci.digitalacademy.cantine.repositories.UserRepository;
import ci.digitalacademy.cantine.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }
}
