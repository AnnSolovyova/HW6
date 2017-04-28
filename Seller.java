/**
 * Created by леново on 28.04.2017.
 */

import java.util.Random;

public class Seller {
    Random r = new Random();
    int numberOfChecks = r.nextInt(100);
    Check[] checks = new Check[numberOfChecks];

    Seller() {
        Store stores = new Store();
        for (int i = 0; i < numberOfChecks; i++) {
            checks[i] = new Check();
        }
    }

    public int getSum() {
        int sumInChecks = 0;
        int sumInStores = 0;
        for (int i = 0; i < numberOfChecks; i++) {
            sumInChecks += checks[i].getSum();
        }
        return sumInChecks;
    }

    public int getProductSum(Goods goods) {
        int priceOfGoodsInCheck = 0;
        int priceOfGoodsInStore = 0;
        for (Goods g : Goods.values()) {

            for (int i = 0; i < numberOfChecks; i++) {
                priceOfGoodsInCheck += checks[i].getProductSum(goods);
            }
        }
        return priceOfGoodsInCheck;
    }
}
