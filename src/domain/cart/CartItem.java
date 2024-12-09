package domain.cart;

public record CartItem(ItemId itemId, SellPrice sellPrice, Quantity quantity) {

    public LinePrice linePrice() {
        return LinePrice.of(sellPrice, quantity);
    }

    public CartItem withQuantity(final Quantity newQuantity) {
        return new CartItem(itemId, sellPrice, newQuantity);
    }
}
