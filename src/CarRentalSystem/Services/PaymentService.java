package CarRentalSystem.Services;

import CarRentalSystem.Dao.BookingTransactionDao;
import CarRentalSystem.Dao.UserDao;
import CarRentalSystem.Dao.VehicleDao;
import CarRentalSystem.Dto.PaymentResponse;
import CarRentalSystem.Model.*;
import CarRentalSystem.PriceCalculatingStratergy.Discount;
import CarRentalSystem.PriceCalculatingStratergy.PriceStrategyInterface;
import CarRentalSystem.PriceCalculatingStratergy.StratergyType;
import CarRentalSystem.PriceCalculatingStratergy.WithoutDiscount;

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

    public PaymentResponse pay(int bookingId, StratergyType stratergyType) {

        BookingTransaction bookingTransaction=bookingTransactionDao.getBookedTransactionById(bookingId);
        Vehicle vehicle=vehicleDao.getVehicleById(bookingTransaction.getVehicleId());
        User customer=userDao.getUserById(bookingTransaction.getCustomerId());

        PriceStrategyInterface priceCalculator=null;

        if (stratergyType==StratergyType.DISCOUNT){
            priceCalculator=new Discount();
        }
        else{
            priceCalculator=new WithoutDiscount();
        }

//        int dayDiff=(int) bookingTransaction.getBookedDate().getTime()-new Date().getTime();
        int dayDiff = (int) (bookingTransaction.getBookedDate().getTime() - new Date().getTime());


        double paidAmount=priceCalculator.getAmount(dayDiff,vehicle.getVehicleType());

        Invoice invoice=new Invoice();
        invoice.setCustomerName(customer.getName());
        invoice.setPaidAmount(paidAmount);
        invoice.setDateOfBooking(bookingTransaction.getBookedDate());
        invoice.setDateOfPayment(new Date());


        PaymentResponse response=new PaymentResponse();
        response.setPaymentStatus(PaymentStatus.PAID);
        return response;
    }
}
