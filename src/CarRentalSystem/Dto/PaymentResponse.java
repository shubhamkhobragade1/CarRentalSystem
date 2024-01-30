package CarRentalSystem.Dto;

import CarRentalSystem.Model.Invoice;
import CarRentalSystem.Model.PaymentStatus;

public class PaymentResponse {

    PaymentStatus paymentStatus;
    Invoice invoice;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
