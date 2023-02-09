public class Competitor {
    // Attributes
    private String id;
    private String name;
    private String country;
    private String country_code;
    private String abbreviation;
    private String qualifier;
    private String gender;

    // Methods
    public Competitor(String id, String name, String country, String country_code, String abbreviation, String qualifier, String gender)
    {
        this.id = id;
        this.name = name;
        this.country = country;
        this.country_code = country_code;
        this.abbreviation = abbreviation;
        this.qualifier = qualifier;
        this.gender = gender;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCountry() { return country; }
    public String getCountry_code() { return country_code; }
    public String getAbbreviation() { return abbreviation; }
    public String getQualifier() { return qualifier; }
    public String getGender() { return gender; }


}
