package CarRentalSystem.Model;

import java.util.Date;

public class BookingTransaction extends BaseModel {


    private int customerId;
    private int vehicleId;

    private PaymentStatus PaymentStatus;
    private int PaidAmount;
    private TransactionStatus transactionStatus;
    private Date bookedDate;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public PaymentStatus getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public int getPaidAmount() {
        return PaidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        PaidAmount = paidAmount;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
