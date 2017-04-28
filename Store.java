/**
 * Created by леново on 21.04.2017.
 */

import java.util.Random;

public class Store implements Summ {

    Random r = new Random();
    int randomNumber = r.nextInt(100);
    Goods[] goods = new Goods[randomNumber];
    int[] allGoods = new int[6];

    Store() {
        for (int i = 0; i < randomNumber; i++) {
            goods[i] = Goods.values()[r.nextInt(Goods.values().length)];
            for (Goods p : Goods.values()) {
                if (goods[i] == p) {
                    allGoods[p.ordinal()] = allGoods[p.ordinal()] + 1;
                }
            }
        }
    }

    public int getSum() {
        int sum = 0;
        for (Goods p : Goods.values()) {
            sum += p.getPrice() * allGoods[p.ordinal()];
        }
        return sum;
    }


    public int getProductSum(Goods goods) {
        for (Goods p : Goods.values()) {
            if (p == goods) {
                return p.getPrice() * allGoods[p.ordinal()];
            }
        }
        return 0;
    }
}
