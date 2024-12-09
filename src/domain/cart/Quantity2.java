package domain.cart;

public final class Quantity2 {

    private final Integer value;

    public Quantity2(final Integer value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        this.value = value;
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof final Quantity2 other)) return false;
        return other.value.equals(value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Quantity2[value=%d]", value);
    }
}
