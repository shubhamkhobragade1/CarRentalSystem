package CarRentalSystem.Services;

import CarRentalSystem.Dao.BookingTransactionDao;
import CarRentalSystem.Dao.UserDao;
import CarRentalSystem.Dao.VehicleDao;
import CarRentalSystem.Dto.PaymentResponse;
import CarRentalSystem.Model.*;
import CarRentalSystem.DesingPatterns.*;

import java.util.Date;

public class PaymentService {

    BookingTransactionDao bookingTransactionDao;
    VehicleDao vehicleDao;
    UserDao userDao;
    public PaymentService(BookingTransactionDao bookingTransactionDao,VehicleDao vehicleDao,UserDao userDao){
        this.bookingTransactionDao=bookingTransactionDao;
        this.userDao=userDao;
        this.vehicleDao=vehicleDao;
    }

    public PaymentResponse pay(int bookingId, StratergyType stratergyType, int accountNum) {

        BookingTransaction bookingTransaction=bookingTransactionDao.getBookedTransactionById(bookingId);
        Vehicle vehicle=vehicleDao.getVehicleById(bookingTransaction.getVehicleId());
        User customer=userDao.getUserById(bookingTransaction.getCustomerId());

        PriceStrategyInterface priceCalculator= Factory.getStrategy(stratergyType);

//        int dayDiff=(int) bookingTransaction.getBookedDate().getTime()-new Date().getTime();
        int dayDiff = (int) (bookingTransaction.getBookedDate().getTime() - new Date().getTime());
        double paidAmount=priceCalculator.getAmount(dayDiff,vehicle.getVehicleType());

        PaymentResponse response=new PaymentResponse();
        PaymentStatus paymentStatus= AxisBankAdapter.pay(accountNum,paidAmount);
        if(paymentStatus.equals(PaymentStatus.UNPAID)){
            response.setPaymentStatus(PaymentStatus.UNPAID);
            return response;
        }

        Invoice invoice=new Invoice();
        invoice.setCustomerName(customer.getName());
        invoice.setPaidAmount(paidAmount);
        invoice.setDateOfBooking(bookingTransaction.getBookedDate());
        invoice.setDateOfPayment(new Date());

        response.setInvoice(invoice);
        response.setPaymentStatus(PaymentStatus.PAID);
        return response;
    }
}
