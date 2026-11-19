package business;

public class Payment {
    String paymentMode;

    public Payment(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void displayPayment(){
        System.out.println("Payment Mode= "+paymentMode);
    }
}
