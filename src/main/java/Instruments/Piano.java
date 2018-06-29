package Instruments;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Piano extends Instrument {

    private String pedals;

    public Piano(String brand, String material, String colour, InstrumentType type, String pedals, int boughtPrice, int sellPrice) {
        super(brand, material, colour, type, boughtPrice, sellPrice);
        this.pedals = pedals;

    }


    public String getPedals() {
        return pedals;
    }
}
