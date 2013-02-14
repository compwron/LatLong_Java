import java.util.ArrayList;
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
        List<String> airportCodes = new ArrayList<String>();

        String[] codes = allAirportCodes.split("\n");
        for(String airportCode : codes){
            airportCodes.add(airportCode);
        }
        return airportCodes;
    }

    public List<String> getAirportCodes() {
        return airPortCodes;
    }
}
