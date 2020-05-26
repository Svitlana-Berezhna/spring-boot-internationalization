package ua.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.testing.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * <h1>Spring Boot Internationalization</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-04
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    List<User> findAll();
}
