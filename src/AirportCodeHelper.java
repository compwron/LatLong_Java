import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirportCodeHelper {
    List<String> airPortCodes;

    public AirportCodeHelper(){
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
        this.airPortCodes = parseAirportCodes(longListOfStationCodes);
    }

    List<String> parseAirportCodes(String airportCodes) {
        List<String> codeList = new ArrayList<String>();
        String[] codes = airportCodes.split("\n");
        Collections.addAll(codeList, codes);
        return codeList;
    }

    public List<String> getAirportCodes() {
        return airPortCodes;
    }
}
