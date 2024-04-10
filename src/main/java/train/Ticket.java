package train;

public class Ticket {
    private final double PRICE_KM = 0.21;

    private final int UNDER_AGE = 18;
    private final double UNDER_DISCOUNT = 0.2;

    private final int OVER_AGE = 65;
    private final double OVER_DISCOUNT = 0.4;

    private int age;
    private int km;

    public Ticket(int age, int km) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (km <= 0) {
            throw new IllegalArgumentException("Kilometers cannot be negative");
        }

        this.age = age;
        this.km = km;
    }

    public double getPriceTicket(){
        double discount = 0;
        if (age < 18) discount = UNDER_DISCOUNT;
        if (age > 65) discount = OVER_DISCOUNT;
        return (km * PRICE_KM) * (1 - discount);
    }
}
