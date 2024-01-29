package CarRentalSystem.Dto;

import CarRentalSystem.Model.PaymentStatus;

public class PaymentResponse {

    PaymentStatus paymentStatus;

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
