// LifelineSite.java
public class LifelineSite extends Site {
    private double _units;
    private double _rate;
    private static final double TAX_RATE = 0.2;

    // Constructor
    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * TAX_RATE * 0.2;
        return base + tax;
    }
}
