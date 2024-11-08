// ResidentialSite.java
public class ResidentialSite extends Site {

    // Constructor
    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
