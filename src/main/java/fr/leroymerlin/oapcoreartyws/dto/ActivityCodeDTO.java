package fr.leroymerlin.oapcoreartyws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

/**
 * @author Farouk KABOUCHE
 *
 * Activity Code
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
public class ActivityCodeDTO {
    private Long id;
    private String wording;

}

