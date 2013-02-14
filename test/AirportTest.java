import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AirportTest {
    Airport airport;

    @Before
    public void setUp(){
        airport = new Airport("&latitude=11.111111&longitude=11.111112&name=FOOW");
    }

    @Test
    public void shouldContainSqlWhenGivenAirportCode(){
        String expectedSql = "update station set latitude=(11.111111), longitude=(11.111112) where airport_code = 'FOO';";
        assertEquals(expectedSql, airport.getSql());
    }

    @Test
    public void creatingAirportShouldPopulateBasicFields(){
        assertTrue(11.111111 == airport.getLatitude());
        assertTrue(11.111112 == airport.getLongitude());
        assertTrue("FOO".equals(airport.getAirportCode()));
    }
}
