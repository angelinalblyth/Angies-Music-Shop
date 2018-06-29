package Instruments;

import shop.Stock;

public class Instrument extends Stock {

    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument(String brand, String material, String colour, InstrumentType type, Double boughtPrice, Double sellPrice) {
        super(brand, boughtPrice, sellPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }
}
