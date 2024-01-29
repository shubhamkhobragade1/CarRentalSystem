package CarRentalSystem.Controller;

import CarRentalSystem.Dto.PaymentRequest;
import CarRentalSystem.Dto.PaymentResponse;
import CarRentalSystem.Services.PaymentService;

public class PaymentController {

    PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }


    public PaymentResponse pay(PaymentRequest request){

        PaymentResponse response=paymentService.pay(request.getBookingId(),request.getStratergyType());

        return response;
    }

}
