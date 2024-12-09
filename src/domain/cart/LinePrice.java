package domain.cart;

import java.math.BigDecimal;

public record LinePrice(BigDecimal value) {

    public static LinePrice of(final SellPrice sellPrice, final Quantity quantity) {
        return new LinePrice(sellPrice.value().multiply(BigDecimal.valueOf(quantity.value())));
    }
}
