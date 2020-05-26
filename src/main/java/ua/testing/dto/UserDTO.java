package ua.testing.dto;

import lombok.*;

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
public class UserDTO {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }
}
