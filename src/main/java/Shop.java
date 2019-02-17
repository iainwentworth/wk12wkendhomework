import Instruments.Behaviours.ISell;
import Instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public int totalProfit() {
        int profit = 0;
        for (ISell item : stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
