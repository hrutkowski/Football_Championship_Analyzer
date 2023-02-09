import java.util.Collections;

public class Event_Vector_Sorter {

    public void sortByProbability(Event_Vector event_vector)
    {
        Collections.sort(event_vector, (e1, e2) -> Double.compare(e2.max_probability, e1.max_probability));
    }
}
