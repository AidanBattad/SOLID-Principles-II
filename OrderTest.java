public class  {
    public static void main(String[] args) {
        // DIP: Depend on abstractions, not concrete implementations
        Order order = new OrderAction();
        OrderProcessor orderProcessor = (OrderProcessor) order;
        InvoiceGenerator invoiceGenerator = (InvoiceGenerator) order;
        NotificationSender notificationSender = (NotificationSender) order;

        order.calculateTotal(10.0, 2);
        orderProcessor.placeOrder("John Doe", "123 Main St");
        invoiceGenerator.generateInvoice("order_123.pdf");
        notificationSender.sendEmailNotification("johndoe@example.com");
    }
}
