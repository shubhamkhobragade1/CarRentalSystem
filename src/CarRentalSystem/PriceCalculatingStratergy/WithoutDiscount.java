package CarRentalSystem.PriceCalculatingStratergy;

import CarRentalSystem.Model.VehicleType;

public class WithoutDiscount implements PriceStrategyInterface {
    @Override
    public double getAmount(int noOfDays, VehicleType vehicleType) {
        return 0;
    }
}
