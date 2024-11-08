// LifelineSite.java
public class LifelineSite extends Site {

    // Constructor
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
