package fr.leroymerlin.oapcoreartyws.service;


import fr.leroymerlin.oapcoreartyws.config.WebServiceClient;
import fr.leroymerlin.oapcoreartyws.converter.ActivityCodeConverter;
import fr.leroymerlin.oapcoreartyws.dto.ActivityCodeDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Farouk KABOUCHE
 *
 * Activity Code Service
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ActivityCodeService {

    private final WebServiceClient webServiceClient;
    private final ActivityCodeConverter activityCodeConverter;

    /**
     * Get List of Activity Code
     * @param storeId
     * @return {@link List <ActivityCodeDTO>}
     */
    public List<ActivityCodeDTO> listActivityCode(String storeId) {
        return this.activityCodeConverter.convertList(this.webServiceClient.getPrestationTypeByStore(storeId));
    }

}
