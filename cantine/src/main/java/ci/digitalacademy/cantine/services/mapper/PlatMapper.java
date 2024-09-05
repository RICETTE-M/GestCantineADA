package ci.digitalacademy.cantine.services.mapper;

import ci.digitalacademy.cantine.models.Plat;
import ci.digitalacademy.cantine.services.dto.PlatDTO;
import jakarta.persistence.ManyToOne;

public interface PlatMapper extends EntityMapper<PlatDTO, Plat>{
}
