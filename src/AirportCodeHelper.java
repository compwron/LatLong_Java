import java.util.List;

public class AirportCodeHelper {
    List<String> airPortCodes;

    public AirportCodeHelper(){
        this.airPortCodes = parseAirportCodes("");
    }

    public AirportCodeHelper(String allAirportCodes){
        this.airPortCodes = parseAirportCodes(allAirportCodes);
    }

    private List<String> parseAirportCodes(String allAirportCodes) {
        return null;
    }



    public List<String> getAirportCodes() {
        return airPortCodes;
    }
}
