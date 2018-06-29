package Instruments;

public enum InstrumentType {

    WOODWIND("Woodwind"),
    STRING("String"),
    ELECTRIC("Electric"),
    BRASS("Brass"),
    PERCUSSION("Percussion"),
    WIND("Wind"),
    KEYBOARD("Keyboard");

    private String value;

    InstrumentType(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
