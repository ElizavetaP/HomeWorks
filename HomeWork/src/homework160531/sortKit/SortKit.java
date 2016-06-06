package homework160531.sortKit;

import java.util.Collections;
import java.util.Comparator;

/**
 * This class is used to sort kit.
 */
public class SortKit {

    public static void main(String[] args) {

        BeginnerKit kit = new BeginnerKit();

        Stationery kit1 = kit.createKit();
        System.out.println(kit1);

        //sort by design and price
        Collections.sort(kit1.getList());
        System.out.println(kit1);

        /**
         * create a comparator for sorting by color.
         */
        Comparator<OfficeAccessory> colorComparator = new Comparator<OfficeAccessory>() {
            @Override
            public int compare(OfficeAccessory o1, OfficeAccessory o2) {

                return o1.getColor().compareTo(o2.getColor());
            }
        };

        Collections.sort(kit1.getList(), colorComparator);

        System.out.println(kit1);

        /**
         * create a comparator for sorting by price.
         */
        Comparator<OfficeAccessory> priceComparator = new Comparator<OfficeAccessory>() {
            @Override
            public int compare(OfficeAccessory o1, OfficeAccessory o2) {

                return (int) (o1.getPrice() - o2.getPrice());
            }
        };

        Collections.sort(kit1.getList(), priceComparator);

        System.out.println(kit1);


    }
}
