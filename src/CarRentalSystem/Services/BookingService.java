package CarRentalSystem.Services;

import CarRentalSystem.Dao.BookingTransactionDao;
import CarRentalSystem.Dao.UserDao;
import CarRentalSystem.Dao.VehicleDao;
import CarRentalSystem.Dto.BookingResponse;
import CarRentalSystem.Dto.BookingStatus;
import CarRentalSystem.Model.*;

import java.util.Date;

public class BookingService {


    private UserDao userDao;
    private VehicleDao vehicleDao;
    private BookingTransactionDao bookingTransactionDao;

    public BookingService(UserDao userDao,VehicleDao vehicleDao,BookingTransactionDao bookingTransaction){
        this.userDao=userDao;
        this.vehicleDao=vehicleDao;
        this.bookingTransactionDao=bookingTransaction;
    }

    public BookingResponse bookingCar(int paidAmount,int customerId, int licenseNum, int vehicleId) {


        BookingTransaction bookingTransaction=new BookingTransaction();

        bookingTransaction.setBookedDate(new Date());
        bookingTransaction.setPaidAmount(paidAmount);
        bookingTransaction.setCustomerId(customerId);
        bookingTransaction.setVehicleId(vehicleId);
        bookingTransaction.setPaymentStatus(PaymentStatus.PARTIALLY_PAID);
        bookingTransaction.setTransactionStatus(TransactionStatus.IN_PROGRESS);

        BookingStatus status=bookingTransactionDao.save(bookingTransaction);

        BookingResponse response=new BookingResponse();
        response.setBookingStatus(status);

        return response;
    }
}
