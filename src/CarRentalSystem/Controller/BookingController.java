package CarRentalSystem.Controller;

import CarRentalSystem.Dto.BookingRequest;
import CarRentalSystem.Dto.BookingResponse;
import CarRentalSystem.Services.BookingService;

public class BookingController {

    private BookingService bookingService;

    private BookingController( BookingService bookingService){
        this.bookingService=bookingService;

    }

    public BookingResponse bookingCar(BookingRequest request){



        BookingResponse response=bookingService.bookingCar(request.getIntialPaidAmount(),request.getCustomerId(),request.getLicenseNum(),request.getVehicleId());


        return response;
    }


}
