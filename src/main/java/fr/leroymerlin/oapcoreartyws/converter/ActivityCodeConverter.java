package fr.leroymerlin.oapcoreartyws.converter;

import com.adeo.diamant.arty.service.DomaineCompetenceLightDTO;
import fr.leroymerlin.oapcoreartyws.dto.ActivityCodeDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Farouk KABOUCHE
 *
 * Activity Code Converter
 */
@Component
public class ActivityCodeConverter implements SoapConverter<ActivityCodeDTO, DomaineCompetenceLightDTO> {
    /**
     * Convert DomaineCompetenceLightDTO to Activity Code
     * @param domaineCompetenceLightDTO
     * @return {@link ActivityCodeDTO}
     */
    public ActivityCodeDTO convert(final DomaineCompetenceLightDTO domaineCompetenceLightDTO) {
        return new ActivityCodeDTO()
                .withId(domaineCompetenceLightDTO.getCodeActivite().longValue())
                .withWording(domaineCompetenceLightDTO.getLblActivite());
    }

    /**
     * Convert List<DomaineCompetenceLightDTO> to List<ActivityCode>
     * @param domaineCompetenceLightDTO
     * @return {@link List <ActivityCodeDTO>}
     */
    public List<ActivityCodeDTO> convertList(final List<DomaineCompetenceLightDTO> domaineCompetenceLightDTO){
        return domaineCompetenceLightDTO
                .stream()
                .map(dto -> convert(dto))
                .collect(Collectors.toList());
    }
}

