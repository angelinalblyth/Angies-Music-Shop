package shop;

public abstract class Stock {

    private String brand;
    private int boughtPrice;
    private int sellPrice;

    public Stock(String brand, int boughtPrice, int sellPrice) {
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getBrand() {
        return brand;
    }
}
