import org.junit.Before;
import org.junit.Test;
import sun.net.www.http.HttpClient;

import java.net.HttpURLConnection;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class ConnectUtilTest {
    ConnectUtil util;

    @Before
    public void setUp(){
        util = new ConnectUtil();
    }

    @Test
    public void shouldGetAccurateUrlForAirportCode(){
        String expectedUrl = "look up the real url";
        assertEquals(expectedUrl, util.urlFor("HOU"));
    }

//    @Test
//    public void foo(){
//        ConnectUtil util = new ConnectUtil(mock(HttpURLConnection.class));
//        String html = util.getAirportData("HOU");
//        assertTrue(html.contains("&name=HOU"));
//        assertTrue(html.contains("&latitude=1"));
//        assertTrue(html.contains("&longitude=2"));
//    }
}
