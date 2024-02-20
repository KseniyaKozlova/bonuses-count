package by.itacademy.bonusescount.entity;

import by.itacademy.bonusescount.enums.TareCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.UUID;

import static by.itacademy.bonusescount.util.Constants.*;
import static jakarta.persistence.EnumType.STRING;

@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = TARE)
public class Tare {

    @Id
    @Column(name = ID_COLUMN)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(value = STRING)
    @Column(name = TARE_CATEGORY, nullable = false)
    private TareCategory tareCategory;

    @Column(name = LITRES_VOLUME, nullable = false)
    private BigDecimal litresVolume;

    @Column(name = ACCOUNTING_BONUSES_COUNT, nullable = false)
    private Integer accountingBonusesCount;
}
