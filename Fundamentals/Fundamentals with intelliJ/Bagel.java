package bites.examples;

public class Bagel {
    public String seeds() {
        return "This bagel has sesame seeds";
    }

    public String filling() {
        return "This bagel has smoked salmon and cream cheese filling";
    }

    public Integer price() {
        return 10;
    }
    public static void main(String[] args) {
        Bagel bagel = new Bagel();
        System.out.println(bagel.seeds());
        System.out.println(bagel.filling());
        System.out.println("The price of this bagel is: £" + bagel.price());
    }
}
