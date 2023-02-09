import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

// Class responsible for generating structures from JSON file
public class JSON_Worker {
    private static String path;

    public JSON_Worker(String path) { this.path = path; }
    public void work(Event_Vector event_vector){
        JSONParser parser = new JSONParser();
        Number_Worker number_worker = new Number_Worker();
        try {
            Object obj = parser.parse(new FileReader(path));
            JSONObject events = (JSONObject) obj;
            JSONArray eventList = (JSONArray) events.get("Events");
            Iterator i_event = eventList.iterator();
            while (i_event.hasNext())
            {
                JSONObject event = (JSONObject) i_event.next();
                    Event event_HR = new Event((String)event.get("sport_event_id"), (String)event.get("sport_date"), (String)event.get("sport_name"),
                            (String)event.get("competition_name"), (String)event.get("competition_id"), (String)event.get("season_name"),
                            number_worker.changeToDouble((Object)event.get("probability_home_team_winner")), number_worker.changeToDouble((Object)event.get("probability_draw")),
                            number_worker.changeToDouble((Object)event.get("probability_away_team_winner")));
                    JSONArray competitorList = (JSONArray) event.get("competitors");
                    Iterator i_competitor = competitorList.iterator();
                    while (i_competitor.hasNext())
                    {
                        JSONObject competitor = (JSONObject) i_competitor.next();
                            Competitor competitor_HR = new Competitor((String)competitor.get("id"), (String)competitor.get("name"), (String)competitor.get("country"),
                                    (String)competitor.get("country_code"), (String)competitor.get("abbreviation"), (String)competitor.get("qualifier"), (String)competitor.get("gender"));
                            if (competitor_HR.getQualifier().equals("home")) event_HR.setCompetitor_home(competitor_HR);
                            else event_HR.setCompetitor_away(competitor_HR);
                    }
                    JSONObject venue = (JSONObject) event.get("venue");
                    if(venue != null) event_HR.setVenue(new Venue((String)venue.get("id"), (String)venue.get("name"), (long)venue.get("capacity"), (String)venue.get("city_name"),
                                (String)venue.get("country_name"), (String)venue.get("map_coordinates"), (String)venue.get("country_code")));
                    else event_HR.setVenue(new Venue("No data","No data",0,"No data","No data","No data","No data"));
                    event_vector.addElement(event_HR);
            }
        } catch(Exception e) { e.printStackTrace(); }
    }
}

