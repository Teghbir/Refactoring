// Site.java
public class Site {
    protected static final double TAX_RATE = 0.2;
    protected double _units;
    protected double _rate;

    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    // Abstract methods for subclasses to implement
    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount();

}
