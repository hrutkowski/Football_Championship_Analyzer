import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Team_Name_Worker {

    Vector<String> get_unique_names(Event_Vector event_vector)
    {
        Vector<String> result = new Vector<String>();
        for( Event e : event_vector)
        {
            result.add(e.getCompetitor_home().getName());
            result.add(e.getCompetitor_away().getName());
        }
        LinkedHashSet<String> hash_events = new LinkedHashSet<String>(result); // it accepts only unique elements
        result.clear();
        result.addAll(hash_events);
        Collections.sort(result);
        return result;
    }
}
