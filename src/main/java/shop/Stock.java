package shop;

import Behaviours.ISell;

public abstract class Stock implements ISell {

    private String brand;
    private Double boughtPrice;
    private Double sellPrice;

    public Stock(String brand, Double boughtPrice, Double sellPrice) {
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public Double getBoughtPrice() {
        return boughtPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public Double calculateMarkup() {
        return(getSellPrice() - getBoughtPrice());
    }
}
