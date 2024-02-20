package by.itacademy.bonusescount.service;

import by.itacademy.bonusescount.mapper.BonusesCountTareMapper;
import by.itacademy.bonusescount.repository.TareRepository;
import by.itacademy.bonusescount.enums.TareCategory;
import by.itacademy.bonusescount.response.BonusesCountResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class TareService {

    private final TareRepository tareRepository;
    private final BonusesCountTareMapper bonusesCountTareMapper;

    @Transactional(readOnly = true)
    public BonusesCountResponseDto getBonusesCount(final BigDecimal volume, final TareCategory category) {
        return bonusesCountTareMapper.mapToResponse(tareRepository
                .getBonusesCountByFields(volume, category));
    }
}
