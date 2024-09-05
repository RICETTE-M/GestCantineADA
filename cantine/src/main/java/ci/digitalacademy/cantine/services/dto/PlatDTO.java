package ci.digitalacademy.cantine.services.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatDTO {

    private Long id;

    private String name;

    private String summary;

    private PlatDTO platDTO;
}
