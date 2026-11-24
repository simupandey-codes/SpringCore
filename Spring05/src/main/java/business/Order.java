package business;

public class Order{
    Product product;
    Payment payment;

    public Order(Product product, Payment payment) {
        this.product = product;
        this.payment = payment;
    }

    public void displayOrder() {
        product.displayProduct();
        payment.displayPayment();

        System.out.println("Order placed successfully!");
    }
}
