// Site.java
public abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    // Constructor
    public Site(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    // Method to calculate billable amount
    public abstract double getBillableAmount();
}
