// ResidentialSite.java
public class ResidentialSite extends Site {
    private double _units;
    private double _rate;
    private static final double TAX_RATE = 0.2;

    // Constructor
    public ResidentialSite(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
