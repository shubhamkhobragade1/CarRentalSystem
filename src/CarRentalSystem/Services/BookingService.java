package CarRentalSystem.Services;

import CarRentalSystem.Dao.UserDao;
import CarRentalSystem.Dao.VehicleDao;
import CarRentalSystem.Dto.BookingResponse;
import CarRentalSystem.Model.User;
import CarRentalSystem.Model.Vehicle;

public class BookingService {


    private UserDao userDao;
    private VehicleDao vehicleDao;

    public BookingService(UserDao userDao,VehicleDao vehicleDao){
        this.userDao=userDao;
        this.vehicleDao=vehicleDao;
    }

    public BookingResponse bookingCar(int customerId, int licenseNum, int vehicleId) {

        User user= userDao.getUserById(customerId);
        Vehicle vehicle=vehicleDao.getVehicleById(vehicleId);




    }
}
