import java.util.HashSet;

public class CountryHashSet {

    HashSet<String> H1 = new HashSet<String>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        }
        return null;
    }

    public static void main(String[] args) {

        CountryHashSet obj = new CountryHashSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println(obj.H1);

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}