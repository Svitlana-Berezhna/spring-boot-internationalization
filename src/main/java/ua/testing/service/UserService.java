package ua.testing.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.testing.dto.UserDTO;
import ua.testing.dto.UsersDTO;
import ua.testing.entity.User;
import ua.testing.repository.UserRepository;

import java.util.Optional;

/**
 * <h1>Spring Boot Internationalization</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-04
 */
@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersDTO getAllUsers() {
        return new UsersDTO(userRepository.findAll());
    }

    public Optional<User> findByUserLogin(UserDTO userDTO) {
        return userRepository.findByEmail(userDTO.getEmail());
    }

    public void saveNewUser(User user) {
        try {
            userRepository.save(user);
        } catch (Exception ex) {
        }
    }
}
