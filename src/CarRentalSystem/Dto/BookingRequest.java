package CarRentalSystem.Dto;

public class BookingRequest {


    private int LicenseNum;
    private int customerId;

    private int vehicleId;

    private int intialPaidAmount;

    public int getIntialPaidAmount() {
        return intialPaidAmount;
    }

    public void setIntialPaidAmount(int intialPaidAmount) {
        this.intialPaidAmount = intialPaidAmount;
    }

    public int getLicenseNum() {
        return LicenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        LicenseNum = licenseNum;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
