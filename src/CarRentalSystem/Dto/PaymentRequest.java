package CarRentalSystem.Dto;

import CarRentalSystem.DesingPatterns.StratergyType;

public class PaymentRequest {
    public StratergyType getStratergyType() {
        return stratergyType;
    }

    public void setStratergyType(StratergyType stratergyType) {
        this.stratergyType = stratergyType;
    }

    private int bookingId;
    private StratergyType stratergyType;

    private int accountNum ;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getBookingId() {
        return bookingId;
    }


    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
