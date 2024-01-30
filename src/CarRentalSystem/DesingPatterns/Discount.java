package CarRentalSystem.DesingPatterns;

import CarRentalSystem.Model.VehicleType;

public class Discount implements PriceStrategyInterface {
    @Override
    public double getAmount(int noOfDays, VehicleType vehicleType) {
        return 0;
    }
}
