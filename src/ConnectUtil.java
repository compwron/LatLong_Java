import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectUtil {

    public String getAirportData(String airportCode){
        return htmlFrom(urlFor(airportCode));
    }

    String urlFor(String airportCode) {
        return "http://airnav.com/airport/" + airportCode;
    }

    String htmlFrom(String url){
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            return connection.getResponseMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
