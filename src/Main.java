import domain.cart.CartItem;
import domain.cart.ItemId;
import domain.cart.Quantity;
import domain.cart.Quantity2;
import domain.cart.SellPrice;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // カート商品を作成
        final CartItem cartItem = new CartItem(new ItemId(1L), new SellPrice(BigDecimal.valueOf(100L)), new Quantity(1));

        // カート商品の合計金額を計算
        System.out.println("合計金額①: " + cartItem.linePrice().value());

        // カート商品の数量を変更
        final CartItem updatedCartItem = cartItem.withQuantity(new Quantity(2));
        // カート商品の数量を変更(JEP468)
//        final CartItem updatedCartItem = cartItem with {
//            quantity = new Quantity(3);
//        }

        // カート商品の合計金額を再計算
        System.out.println("合計金額②: " + updatedCartItem.linePrice().value());

        // recordの生成メソッド確認
        final Quantity quantity = new Quantity(1);
        System.out.println(quantity.hashCode());
        System.out.println(quantity);
        final Quantity2 quantity2 = new Quantity2(1);
        System.out.println(quantity2.hashCode());
        System.out.println(quantity2);
    }
}