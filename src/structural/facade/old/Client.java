package structural.facade.old;

public class Client {

    public static void main(String[] args) {

        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();

        Bill bill = billingSystem.createBill(1000);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }
}
