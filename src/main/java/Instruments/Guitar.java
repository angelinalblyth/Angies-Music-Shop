package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String shape;


    public Guitar(String brand, String material, String colour, InstrumentType type, String shape, Double boughtPrice, Double sellPrice) {
        super(brand, material, colour, type, boughtPrice, sellPrice);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String sound() {
        return "Strum strum strum";
    }

}
