package homework160531.accountingStationery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 6/3/16.
 */
public class Stationery<T> {

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
}
