import java.io.Serializable;

public class ZoomGlobalDialInNumbersDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String country;

    private String country_name;

    private String city;

    private String number;

    private String type;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ZoomGlobalDialInNumbersDTO [city=" + getCity() + ", country=" + getCountry() + ", country_name=" + getCountry_name()
                + ", number=" + getNumber() + ", type=" + getType() + "]";
    }
}