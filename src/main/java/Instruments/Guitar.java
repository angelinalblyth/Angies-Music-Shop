package Instruments;

public class Guitar extends Instrument {

    private String shape;


    public Guitar(String brand, String material, String colour, InstrumentType type, String shape, int boughtPrice, int sellPrice) {
        super(brand, material, colour, type, boughtPrice, sellPrice);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
