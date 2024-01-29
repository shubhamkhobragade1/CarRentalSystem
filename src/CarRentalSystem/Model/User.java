package CarRentalSystem.Model;

public class User  extends BaseModel{

    private  String name;

    private  String address;

    private JourneyStatus journeyStatus;
    private boolean isLieceneHolder;
    private int LicenseNumber;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
