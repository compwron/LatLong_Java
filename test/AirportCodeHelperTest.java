import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class AirportCodeHelperTest {

    @Test
    public void shouldReturnListOfAirportCodesWhenGivenAirportCodesAsALinebreakSeparatedStringWithTrainingLinebreak(){
        AirportCodeHelper helper = new AirportCodeHelper();

        List<String> expectedList = new ArrayList<String>();
        expectedList.add("DAL");
        expectedList.add("HOU");
        expectedList.add("ABQ");

        assertEquals(expectedList, helper.parseAirportCodes("DAL\nHOU\nABQ\n"));
    }
}
