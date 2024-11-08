// ResidentialSite.java
public class ResidentialSite extends Site {

    // Constructor
    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate;
    }

    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
