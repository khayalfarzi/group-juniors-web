package az.iktlab.groupjuniorsweb.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CurrencyConverter {

    BigDecimal amount;
    Currency ccy;

    @Override
    public String toString() {
        return "CurrencyConverter{" +
                "amount=" + amount +
                ", ccy=" + ccy +
                '}';
    }
}