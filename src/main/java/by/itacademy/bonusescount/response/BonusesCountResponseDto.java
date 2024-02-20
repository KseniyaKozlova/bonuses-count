package by.itacademy.bonusescount.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonusesCountResponseDto {

    private Integer accountingBonusesCount;
}
