import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Airport {
    Double latitude;
    Double longitude;
    String airportCode;
    String sql;

    public Airport(String htmlSnippet){
        latitude = parseLatitude(htmlSnippet);
        longitude = parseLongitude(htmlSnippet);
        airportCode = parseAirportCode(htmlSnippet);
        sql = generateSql();
    }

    private Double parseLongitude(String htmlSnippet){
        Pattern pattern = Pattern.compile(".*latitude=.*&longitude=(.*?)&.*", Pattern.DOTALL);;
        Matcher matcher = pattern.matcher(htmlSnippet);
        return matcher.matches() ? Double.valueOf(matcher.group(1)): null;
    }

    private Double parseLatitude(String htmlSnippet){
        Pattern pattern = Pattern.compile(".*latitude=(.*?)&longitude.*", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(htmlSnippet);
        return matcher.matches() ? Double.valueOf(matcher.group(1)): null;
    }


    private String parseAirportCode(String htmlSnippet){
        Pattern pattern = Pattern.compile(".*&name=(.{3}).*", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(htmlSnippet);
        return matcher.matches() ? matcher.group(1): null;
    }

    private String generateSql() {
        return "update station set latitude=("+latitude+"), longitude=("+longitude+") where airport_code = '"+airportCode+"';";
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public String getSql() {
        return sql;
    }
}
