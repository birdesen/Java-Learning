import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("TR", "Türkiye");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

        //System.out.println(country.get("TR"));

        for (String countryKey : country.keySet()){
            System.out.println(countryKey);
        }
        System.out.println("-------------");
        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }
    }
}
