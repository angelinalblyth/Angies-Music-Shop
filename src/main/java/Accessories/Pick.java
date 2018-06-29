package Accessories;

import shop.Stock;

public class Pick extends Accessory {

    private String shape;
    private String weight;


    public Pick(String brand, Double boughtPrice, Double sellPrice, String shape, String weight) {
        super(brand, boughtPrice, sellPrice);
        this.shape = shape;
        this.weight = weight;
    }

    public String getShape() {
        return shape;
    }

    public String getWeight() {
        return weight;
    }
}
