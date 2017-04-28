/**
 */

import java.util.Random;

public class Check implements Summ {
    Random r = new Random();
    int randomNumber = r.nextInt(100);
    Goods[] goodsCheck = new Goods[randomNumber];
    int[] allGoodsCheck = new int[6];

    Check() {
        for (int i = 0; i < randomNumber; i++) {
            goodsCheck[i] = Goods.values()[r.nextInt(Goods.values().length)];
            for (Goods p : Goods.values()) {
                if (goodsCheck[i] == p) {
                    allGoodsCheck[p.ordinal()]
                            = allGoodsCheck[p.ordinal()] + 1;
                }
            }
        }
    }

    public int getSum() {
        int sum = 0;
        for (Goods p : Goods.values()) {
            sum += p.getPrice() * allGoodsCheck[p.ordinal()];
        }
        return sum;
    }

    public int getProductSum(Goods goods) {
        for (Goods p : Goods.values()) {
            if (p == goods) {
                return p.getPrice() * allGoodsCheck[p.ordinal()];
            }
        }
        return 0;
    }
}
