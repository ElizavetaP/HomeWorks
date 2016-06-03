package homework160531.accountingStationery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 6/3/16.
 */
public class Stationery<T extends OfficeAccessory> {

    public List<T> accessories = new ArrayList<>();

    void add(T accessory) {
        accessories.add(accessory);
    }

    void remove(T accessory) {
        accessories.remove(accessory);
    }

    @Override
    public String toString() {
        return accessories.toString();
    }

    public double totalCost() {

        double cost = 0;
        for (int i = 0; i < accessories.size(); i++) {
            cost += accessories.get(i).getPrice();
        }
        return cost;
    }
}
