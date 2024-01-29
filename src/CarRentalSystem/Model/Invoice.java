package CarRentalSystem.Model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Invoice extends BaseModel{

    private PaymentStatus paymentStatus;
    private int paymentRefNumber;
    private Date dateOfBooking;
    private Date dateOfPayment;
    private Date returnDate;

    private double paidAmount;

    private String customerName;

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentRefNumber() {
        return paymentRefNumber;
    }

    public void setPaymentRefNumber(int paymentRefNumber) {
        this.paymentRefNumber = paymentRefNumber;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
