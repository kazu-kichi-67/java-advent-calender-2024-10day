package domain.cart;

public class Quantity2 {

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

    public boolean equals(final Object o) {
        if (!(o instanceof final Quantity2 other)) return false;
        return other.value.equals(value);
    }

    public int hashCode() {
        return value.hashCode();
    }

    public String toString() {
        return String.format("Quantity2[value=%d]", value);
    }
}
