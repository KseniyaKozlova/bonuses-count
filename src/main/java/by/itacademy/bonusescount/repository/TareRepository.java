package by.itacademy.bonusescount.repository;

import by.itacademy.bonusescount.entity.Tare;
import by.itacademy.bonusescount.enums.TareCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.UUID;

public interface TareRepository extends JpaRepository<Tare, UUID> {

    @Query(value = "SELECT tare.accountingBonusesCount FROM Tare AS tare " +
            "WHERE tare.litresVolume = :volume AND tare.tareCategory = :category")
    Integer getBonusesCountByFields(@Param(value = "volume") BigDecimal litresVolume,
                                    @Param(value = "category") TareCategory tareCategory);
}
