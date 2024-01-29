package CarRentalSystem.Dto;

import CarRentalSystem.PriceCalculatingStratergy.StratergyType;

import javax.xml.crypto.Data;

public class PaymentRequest {
    public StratergyType getStratergyType() {
        return stratergyType;
    }

    public void setStratergyType(StratergyType stratergyType) {
        this.stratergyType = stratergyType;
    }

    private int bookingId;
    private StratergyType stratergyType;
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
