package ci.digitalacademy.cantine.services.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;

    private String pseudo;

    private String password;

    private UserDTO userDTO;
}
