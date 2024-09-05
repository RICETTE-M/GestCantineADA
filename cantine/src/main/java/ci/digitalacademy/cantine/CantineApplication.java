package ci.digitalacademy.cantine;

import ci.digitalacademy.cantine.services.MenuService;
import ci.digitalacademy.cantine.services.PlatService;
import ci.digitalacademy.cantine.services.UserService;
import ci.digitalacademy.cantine.services.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class CantineApplication {

	@Autowired
	private PlatService platService;

	@Autowired
	private MenuService menuService;

	@Autowired
	private UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(CantineApplication.class, args);



//			UserDTO user = new UserDTO();
//			user.setUser("admin");
//			UserDTO user1 = new UserDTO();
//			user1.setUser("staff");
//
//			List<UserDTO> UsersDTO = Arrays.asList(user, user1);
		}



}
