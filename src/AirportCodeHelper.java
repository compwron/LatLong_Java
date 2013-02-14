import java.util.ArrayList;
import java.util.List;

public class AirportCodeHelper {
    List<String> airPortCodes;

    public AirportCodeHelper(){
        this.airPortCodes = parseAirportCodes(longListOfStationCodes);
    }

    List<String> parseAirportCodes(String airportCodes) {
        List<String> codeList = new ArrayList<String>();

        String[] codes = airportCodes.split("\n");
        for(String airportCode : codes){
            codeList.add(airportCode);
        }
        return codeList;
    }

    public List<String> getAirportCodes() {
        return airPortCodes;
    }

    String longListOfStationCodes = "AVX\n" +
            "AWG\n" +
            "AXA\n" +
            "AXN\n" +
            "AYS\n" +
            "AZO\n" +
            "B23\n" +
            "BAB\n" +
            "BAD\n" +
            "BAF\n";
}
