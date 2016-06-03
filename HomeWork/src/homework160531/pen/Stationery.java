package homework160531.pen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 6/3/16.
 */
public class Stationery {

    public List<Pen> pens = new ArrayList<>();

    void add(Pen pen){
        pens.add(pen);
    }

    void remove(Pen pen){
        pens.remove(pen);
    }

    @Override
    public String toString() {
        return pens.toString();
    }
}
