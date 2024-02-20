package by.itacademy.bonusescount.mapper;

import by.itacademy.bonusescount.response.BonusesCountResponseDto;
import org.springframework.stereotype.Component;

@Component
public class BonusesCountTareMapper {

    public BonusesCountResponseDto mapToResponse(Integer bonusesCount) {
        return BonusesCountResponseDto.builder()
                .accountingBonusesCount(bonusesCount)
                .build();
    }
}
