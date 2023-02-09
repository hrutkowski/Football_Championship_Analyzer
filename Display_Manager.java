public class Display_Manager {

    public void display_result(Event event, int i)
    {
        System.out.println("EVENT No "+i+":");
        System.out.println("Start date: "+get_start_date(event)+",");
        System.out.println(event.getCompetitor_home().getName()+" ("+event.getCompetitor_home().getCountry()+") vs. "+
                event.getCompetitor_away().getName()+" ("+event.getCompetitor_away().getCountry()+")"+",");
        System.out.println("Venue: "+event.getVenue().getName()+",");
        System.out.println("Highest probable result: "+ get_highest_result_name(event)+ " ("+event.getMax_probability()+")\n");
    }

    public void display_menu_probability()
    {
        System.out.println("Please enter the number of results that you want to display!");
        System.out.println("Type: \"0\" to EXIT)");
    }
    
    private String get_highest_result_name(Event event)
    {
        double maxProbability = event.getProbability_home_team_winner();
        String result_name = "HOME_TEAM_WIN";
        if (event.getProbability_draw() > maxProbability)
        {
            maxProbability = event.getProbability_draw();
            result_name = "DRAW";
        }
        if (event.getProbability_away_team_winner() > maxProbability) { result_name = "AWAY_TEAM_WIN"; }
        return result_name;
    }

    private String get_start_date(Event event) { return event.getStart_date().substring(0,10) +" "+ event.getStart_date().substring(11,19); }
}
