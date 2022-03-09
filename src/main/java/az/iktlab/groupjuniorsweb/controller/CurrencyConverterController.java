package az.iktlab.groupjuniorsweb.controller;

import az.iktlab.groupjuniorsweb.model.Currency;
import az.iktlab.groupjuniorsweb.model.CurrencyConverter;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/currency/converter")
public class CurrencyConverterController {

    @PostMapping
    public BigDecimal getCurrency(@RequestBody CurrencyConverter currencyConverter) {
        return null;
    }

    @GetMapping("/auto")
    public List<CurrencyConverter> autoConvert() {
        return null;
    }

    public CurrencyConverter test() {
        return CurrencyConverter.builder()
                .ccy(Currency.AZN)
                .amount(BigDecimal.valueOf(6))
                .build();
    }
}