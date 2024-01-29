package CarRentalSystem.Dao;

import CarRentalSystem.Dto.BookingStatus;
import CarRentalSystem.Model.BookingTransaction;

public class BookingTransactionDao {
    public BookingStatus save(BookingTransaction bookingTransaction) {

        return BookingStatus.BOOKED;
    }

    public BookingTransaction getBookedTransactionById(int bookingId) {

        return null;

    }
}
