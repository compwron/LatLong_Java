import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectUtil {


    //	HttpURLConnection con = (HttpURLConnection) new URL("https://www.example.com").openConnection();
//	con.setRequestMethod("POST");
//	con.getOutputStream().write("LOGIN".getBytes("UTF-8"));
//	con.getInputStream();
    public String getAirportData(String airportCode){
        HttpURLConnection con = connectionTo(urlFor(airportCode));
        return "";
    }

    String urlFor(String airportCode) {
        return "";
    }

    private HttpURLConnection connectionTo(String url){
        try {
            return (HttpURLConnection) new URL("https://www.example.com").openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
