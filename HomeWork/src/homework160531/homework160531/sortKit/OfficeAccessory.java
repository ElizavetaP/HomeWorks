package homework160531.homework160531.sortKit;

/**
 * This is the base class for creating office accessories.
 */
public abstract class OfficeAccessory implements Comparable<OfficeAccessory> {

    private String color;
    private String design; //Pen: ball, feather, capillary.
    private double price;

    public OfficeAccessory(String color, String design, double price) {
        this.color = color;
        this.design = design;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getDesign() {
        return design;
    }

    /**
     * sort by design and price.
     * @param o
     */
    @Override
    public int compareTo(OfficeAccessory o) {
        String oDesign = o.getDesign();
        if (this.design.compareTo(oDesign) == 0) {
            double oPrice = o.getPrice();
            return (int) (this.price - oPrice);
        }
        return this.design.compareTo(oDesign);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficeAccessory that = (OfficeAccessory) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return design != null ? design.equals(that.design) : that.design == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        result = 31 * result + (design != null ? design.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getColor() + " " + getDesign() + " " + getClass().getSimpleName() + ", pice = " + getPrice();

    }


}

