package ci.digitalacademy.cantine.services.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class MenuDTO {

    private Long id;

    private Date creation_date;

    private MenuDTO menuDTO;
}
