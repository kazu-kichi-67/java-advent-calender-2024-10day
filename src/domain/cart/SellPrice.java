package domain.cart;

import java.math.BigDecimal;

public record SellPrice(BigDecimal value) {

    public SellPrice {
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Sell price must be greater than 0");
        }
    }
}
