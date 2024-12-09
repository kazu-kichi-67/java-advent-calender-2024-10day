package domain.cart;

public record Quantity(Integer value) {

    public Quantity {
        if (value <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
    }
}
