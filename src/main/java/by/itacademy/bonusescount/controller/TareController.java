package by.itacademy.bonusescount.controller;

import by.itacademy.bonusescount.enums.TareCategory;
import by.itacademy.bonusescount.response.BonusesCountResponseDto;
import by.itacademy.bonusescount.service.TareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(path = "/api/version1")
@RequiredArgsConstructor
public class TareController {

    private final TareService tareService;

    @GetMapping(path = "/bonuses_count/category/{tare_category}/volume/{tare_volume}")
    public BonusesCountResponseDto getCompanyAddress(@PathVariable(value = "tare_volume") BigDecimal litresVolume,
                                                     @PathVariable(value = "tare_category") TareCategory category) {
        return tareService.getBonusesCount(litresVolume, category);
    }
}
