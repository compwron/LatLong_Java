import javax.swing.*;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ConnectUtil connectUtil = new ConnectUtil();
        AirportCodeHelper helper = new AirportCodeHelper();
        List<String> airportCodes = helper.getAirportCodes();

        for (String airportCode : airportCodes){
            Airport airport = new Airport(connectUtil.getAirportData(airportCode));
            System.out.println(airport.getSql());
        }
    }
}
