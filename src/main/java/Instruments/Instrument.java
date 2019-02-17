package Instruments;

import Enums.InstrumentType;
import Instruments.Behaviours.IPlay;
import Instruments.Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private InstrumentType type;
    private String colour;
    private int costPrice;
    private int sellPrice;

    public Instrument(String name, InstrumentType type, String colour, int costPrice, int sellPrice) {
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
