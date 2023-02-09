public class Event {
    // Attributes
    private String sport_event_id;
    private String start_date;
    private String sport_name;
    private String competition_name;
    private String competition_id;
    private String season_name;
    private Competitor competitor_home;
    private Competitor competitor_away;
    private Venue venue;
    private double probability_home_team_winner;
    private double probability_draw;
    private double probability_away_team_winner;
    public double max_probability;

    //Methods
    public Event(String sport_event_id, String start_date, String sport_name, String competition_name, String competition_id, String season_name, double probability_home_team_winner, double probability_draw, double probability_away_team_winner)
    {
        this.sport_event_id = sport_event_id;
        this.start_date = start_date;
        this.sport_name = sport_name;
        this.competition_name = competition_name;
        this.competition_id = competition_id;
        this.season_name = season_name;

        this.probability_home_team_winner = probability_home_team_winner;
        this.probability_draw = probability_draw;
        this.probability_away_team_winner = probability_away_team_winner;
        maxProbability();
    }
    public String getSport_event_id() { return sport_event_id; }
    public String getStart_date() { return start_date; }
    public String getSport_name() { return sport_name; }
    public String getCompetition_name() { return competition_name; }
    public String getCompetition_id() { return competition_id; }
    public String getSeason_name() { return season_name; }
    public Competitor getCompetitor_home() { return competitor_home; }
    public Competitor getCompetitor_away() { return competitor_away; }
    public Venue getVenue() { return venue; }
    public double getProbability_home_team_winner() { return probability_home_team_winner;}
    public double getProbability_draw() { return probability_draw; }
    public double getProbability_away_team_winner() { return probability_away_team_winner; }
    public double getMax_probability() { return max_probability; }
    public void setCompetitor_home(Competitor competitor_home) { this.competitor_home = competitor_home; }
    public void setCompetitor_away(Competitor competitor_away) { this.competitor_away = competitor_away; }
    public void setVenue(Venue venue) { this.venue = venue; }
    private void maxProbability() { this.max_probability = Math.max(probability_home_team_winner, Math.max(probability_draw, probability_away_team_winner)); }
}
