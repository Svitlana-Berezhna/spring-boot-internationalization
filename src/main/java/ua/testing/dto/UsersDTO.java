package ua.testing.dto;

import lombok.*;
import ua.testing.entity.User;

import java.util.List;

/**
 * <h1>Spring Boot Internationalization</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-04
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UsersDTO {
    private List<User> users;

    public UsersDTO(List<User> users) {
        this.users = users;
    }
}
