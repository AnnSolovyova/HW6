/**
 * Created by леново on 21.04.2017.
 */
public enum Goods  {
    Fruits(5),
    Vegetables(4),
    Clothes(70),
    Tech(100),
    Chemistry(30),
    Other(50);


    public int price;

    Goods(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}