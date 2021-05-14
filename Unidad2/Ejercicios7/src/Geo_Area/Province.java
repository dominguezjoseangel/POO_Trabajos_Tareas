package Geo_Area;
import java.awt.*;

public class Province extends Zone {
    private String language;
    private String president;
    protected String currency;

    public Province (String name, double surface, String language, String president, String currency){
        super(name,surface);
        this.language = language;
        this.president = president;
        this.currency = currency;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getPresident() {
        return president;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
