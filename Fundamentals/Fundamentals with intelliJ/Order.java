package bites.examples;

public class Order {

    Integer total = 0;

    public void addAmount(Integer number){
        this.total += number;
    }

    public void addDiscount(Integer number){
        this.total -= number;
    }

    public Integer getTotal(){
        return this.total;
    }

    public String friendlyTotal() {
        return String.format("Thanks! The total value of your order is £%d", getTotal());
    }
    public static void main(String[] args) {
        Order order = new Order();
        System.out.print("The order total: " + order.getTotal() + "\n");
        order.addAmount(10);
        System.out.println("The total after adding: " + order.getTotal());
        order.addDiscount(1);
        System.out.print("The total after discounting: " + order.getTotal() + "\n");
        System.out.print(order.friendlyTotal());

    }
}
