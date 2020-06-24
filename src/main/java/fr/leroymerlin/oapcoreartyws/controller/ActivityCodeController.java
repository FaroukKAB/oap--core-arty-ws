package fr.leroymerlin.oapcoreartyws.controller;


import fr.leroymerlin.oapcoreartyws.constant.RestConstantUtils;
import fr.leroymerlin.oapcoreartyws.dto.ActivityCodeDTO;
import fr.leroymerlin.oapcoreartyws.service.ActivityCodeService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Farouk KABOUCHE
 *
 * Activity Code Controller
 */
@Slf4j
@RestController
@RequestMapping(ActivityCodeController.PATH)
@RequiredArgsConstructor
public class ActivityCodeController {

    public final static String PATH = RestConstantUtils.DEFAULT_PATH + "/activity-code";
    private final ActivityCodeService activityCodeService;

    /**
     * Get list of Activity Codes depending to store Id
     * @param storeId
     * @return {@link List <ActivityCodeDTO>}
     */
    @ApiOperation(value = "Refresh activityCode via Arty")
    @GetMapping("list")
    public List<ActivityCodeDTO> listActivityCode(@RequestParam(name = "storeId") final String storeId ) {
        return this.activityCodeService.listActivityCode(storeId);
    }

}
