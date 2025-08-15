package oop.iub.project.project1.marketingOfficer;

public class expandMarketReach {
    private String region;
    private String location;
    private String language;

    public expandMarketReach(String region, String location, String language) {
        this.region = region;
        this.location = location;
        this.language = language;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "expandMarketReach{" +
                "region='" + region + '\'' +
                ", location='" + location + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
