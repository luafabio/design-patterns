package structural.facade.old;

public class InvoiceCustomerSystem {

    public void createInvoiceForBill(Bill bill) {
        System.out.println("create invoice for bill with amount: " + bill.getAmount());
    }
}
