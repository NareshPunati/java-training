import java.util.List;

public class location {

    private String locationId, locationName, locationCountry;


    public location(String locationId, String locationName, String locationCountry) {

        this.locationId =locationId;
        this.locationName = locationName;
        this.locationCountry = locationCountry;

    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }
}
