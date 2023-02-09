public class Venue {
    // Attributes
    private String id;
    private String name;
    private int capacity;
    private String city_name;
    private String country_name;
    private String map_coordinates;
    private String country_code;

    // Methods
    public Venue(String id, String name, long capacity, String city_name, String country_name, String map_coordinates, String country_code)
    {
        this.id = id;
        this.name = name;
        this.capacity = (int)capacity;
        this.city_name = city_name;
        this.country_name = country_name;
        this.map_coordinates = map_coordinates;
        this.country_code = country_code;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public String getCity_name() { return city_name; }
    public String getCountry_name() { return country_name; }
    public String getMap_coordinates() { return map_coordinates; }
    public String getCountry_code() { return country_code; }
}
