import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
            String response = readString(connection.getInputStream());
            return response;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    // http://stackoverflow.com/questions/1763789/how-do-i-convert-an-inputstream-to-a-string-in-javas
    private static String readString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream into = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        for (int n; 0 < (n = inputStream.read(buf));) {
            into.write(buf, 0, n);
        }
        into.close();
        return new String(into.toByteArray(), "UTF-8"); // Or whatever encoding
    }
}
