import org.junit.Before;
import org.junit.Test;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.HttpURLConnection;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConnectUtilTest {

    @Test
    public void shouldGetAccurateUrlForAirportCode(){
        ConnectUtil util = new ConnectUtil();
        String expectedUrl = "http://airnav.com/airport/HOU";
        assertEquals(expectedUrl, util.urlFor("HOU"));
    }
}
