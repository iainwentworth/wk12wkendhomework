package Instruments;

import Enums.InstrumentType;
import Instruments.Behaviours.IPlay;
import Instruments.Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(String name, InstrumentType type, String colour, int costPrice, int sellPrice, int numberOfStrings) {
        super(name, type, colour, costPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Guitar plays";
    }

    public int calculateMarkup(){
        return this.getSellPrice() - this.getCostPrice();
    }


}
