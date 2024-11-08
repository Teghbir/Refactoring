// Main.java
public class Main {
    public static void main(String[] args) {
        // Example values for units and rate
        double units = 100;
        double rate = 0.5;

        // Create instances of ResidentialSite and LifelineSite
        ResidentialSite residentialSite = new ResidentialSite(units, rate);
        LifelineSite lifelineSite = new LifelineSite(units, rate);

        // Calculate and print the billable amounts
        System.out.println("Residential Site Billable Amount: " + residentialSite.getBillableAmount());
        System.out.println("Lifeline Site Billable Amount: " + lifelineSite.getBillableAmount());
    }
}
