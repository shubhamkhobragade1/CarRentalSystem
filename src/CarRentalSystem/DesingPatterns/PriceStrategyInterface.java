package CarRentalSystem.DesingPatterns;

import CarRentalSystem.Model.VehicleType;

public interface PriceStrategyInterface {

    double getAmount(int noOfDays, VehicleType vehicleType);
}
