package Instruments;

import Enums.InstrumentType;
import Instruments.Behaviours.IPlay;
import Instruments.Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String lastMaintenance;

    public Piano(String name, InstrumentType type, String colour, int costPrice, int sellPrice, String lastMaintenance) {
        super(name, type, colour, costPrice, sellPrice);
        this.lastMaintenance = lastMaintenance;
    }

    public String getLastMaintenance() {
        return lastMaintenance;
    }

    public String play() {
        return "Piano plays";
    }

    public int calculateMarkup() {
        return this.getSellPrice() - this.getCostPrice();
    }
}
