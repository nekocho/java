package bites.examples;

public class Discounter {
    Integer discount;

    public Discounter(Integer discount) {
        this.discount = discount;
    }

    public Double applyTo(Double number) {
        // Fixed amount discount
        // return number - this.discount;

        // Percentage discount
        Double discountAmount = (this.discount / 100.0) * number;
        return number - discountAmount;
    }

    public static void main(String[] args) {
        Discounter discounter = new Discounter(20);
        System.out.println("Discounting 20% from 100: " + discounter.applyTo(100.0));
        System.out.println("Discounting 20% from 200: " + discounter.applyTo(200.0));
    }
}
