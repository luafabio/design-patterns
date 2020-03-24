package structural.facade.src;

public class BillingSystem {

    public Bill createBill(Integer amount) {

        // Let's assume some advance logic happens here
        return new Bill(amount);
    }
}
